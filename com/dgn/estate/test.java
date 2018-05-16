package com.dgn.estate;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.json.JSONException;
import org.json.JSONObject;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import com.gargoylesoftware.htmlunit.WebClient;



public class test {
	  public static void main(String[] args) throws IOException, JSONException{
		  List<String> ilanlar = new ArrayList<String>();
		  URL url;
		try {
			for(int j =0 ; j<1000;j+=20)
		    {
			Document doc = Jsoup.connect("https://www.sahibinden.com/kiralik?pagingOffset="+j+"&a23=1133903&a23=38512&a23=38513&a23=38515&address_region=2&a103651=1139073&address_town=440&address_town=441&address_town=446&address_town=447&a20=38470&a20=38473").userAgent("Mozilla/5.0 (Windows; U; WindowsNT 5.1; en-US; rv1.8.1.6) Gecko/20070725 Firefox/2.0.0.6")
		    	      .referrer("http://www.google.com").get();
		       
			    Elements links = doc.getAllElements();
			    int x=0;
			    for(int i =0 ; i<links.size();i++)
			    {
			    	
			    	if (links.get(i).toString().contains("/ilan/")&&links.get(i).attr("href").toString().trim()!="")
			    	{
			    		x++;
			    		if(x%2==0)
			    		{
				    		ilanlar.add(links.get(i).attr("href").toString());
			    		}
			    	}
			    }
		    
		    }
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			List<KonutOzellikler> konutlar = new ArrayList<>();
			try {
				
				for(int j =0;j<ilanlar.size();j++)
				{
					KonutOzellikler konut = new KonutOzellikler();
				    Document doc = Jsoup.connect("https://www.sahibinden.com"+ilanlar.get(j)).userAgent("Mozilla/5.0 (Windows; U; WindowsNT 5.1; en-US; rv1.8.1.6) Gecko/20070725 Firefox/2.0.0.6")
				    	      .referrer("http://www.google.com").get();
				    konut.setLink("https://www.sahibinden.com"+ilanlar.get(j));
				    Elements links = doc.select("meta[name]");
				    for(int i =0 ; i<links.size();i++)
				    {
				    	String name=links.get(i).attr("name").trim();
				    	if(name.equals("og:title"))
				    		konut.setName(links.get(i).attr("content").trim());
				    }
				    links = doc.select("h3");
				    for(int i =0 ; i<links.size();i++)
				    {
				    	String ucret=links.get(i).text();
				    	if(ucret.contains("TL"))
				    		konut.setUcret(Integer.parseInt(ucret.replace(".","").replace("TL", "").replace("Emlak Endeksi", "").trim()));
				    }
				    links = doc.select("h2");
				    for(int i =0 ; i<links.size();i++)
				    {
					    Elements links1 = links.select("a[href]");

					    	String il=links1.get(0).text();
					    	if(il.contains("Ýstanbul"))
					    	{
					    		String ilce=links1.get(1).text();
					    		String mahalle=links1.get(2).text();
					    		konut.setIl(il);
					    		konut.setIlce(ilce);
					    		konut.setMahalle(mahalle);
					    		InputStream is = new URL("https://maps.googleapis.com/maps/api/distancematrix/json?units=imperial&origins=Kosuyolu,Kadikoy&destinations="+URLEncoder.encode(mahalle+","+ilce+","+il, "UTF-8")+"&key=AIzaSyBozFDJsDWKFiec90mHiTgP6Q9CyEq7ud8").openStream();
					    	    try {
					    	      BufferedReader rd = new BufferedReader(new InputStreamReader(is, Charset.forName("UTF-8")));
					    	      String jsonText = readAll(rd);
					    		JSONObject obj = new JSONObject(jsonText);
					    		
					    		double uzaklik=Double.parseDouble(obj.getJSONArray("rows").getJSONObject(0).getJSONArray("elements").getJSONObject(0).getJSONObject("distance").getString("text").replace("m", "").replace("i", "").replace("l", "").trim());
					    		konut.setUzaklik(uzaklik*1.609344);
					    		double saat=0;
					    		double dk=0;
					    		boolean saatvar=false;
					    		String suresi = obj.getJSONArray("rows").getJSONObject(0).getJSONArray("elements").getJSONObject(0).getJSONObject("duration").getString("text");
					    		if(obj.getJSONArray("rows").getJSONObject(0).getJSONArray("elements").getJSONObject(0).getJSONObject("duration").getString("text").contains("hour"))
					    		{
					    			saatvar=true;
					    			saat=Double.parseDouble(suresi.substring(0, obj.getJSONArray("rows").getJSONObject(0).getJSONArray("elements").getJSONObject(0).getJSONObject("duration").getString("text").indexOf("hour")-1));
					    		}
					    		if(saatvar&&suresi.contains("min"))
					    			dk=Double.parseDouble(suresi.substring(suresi.indexOf("hour")+5,suresi.indexOf("min")-1));
					    		else if(suresi.contains("min"))
					    			dk=Double.parseDouble(suresi.substring(0,suresi.indexOf("min")-1));
					    		konut.setSure(saat*60+dk);
					    	}
					    	    catch (Exception e) {
									// TODO: handle exception
								}
					    	}
				    
					    
					    
				    }
				    
				    links = doc.select("li[class]");
				    for(int i =0 ; i<links.size();i++)
				    {
				    	String value=links.get(i).text().replace("Ð", "G").replace("ð", "g").replace("Ü", "U").replace("ü", "u").replace("Þ", "S").replace("þ", "s").replace("Ö", "O").replace("ö", "o").replace("Ý", "I").replace("ý", "i").replace("Ç", "C").replace("ç", "c").replace(" ", "").replace("/", " ").replace("-", "").replace("(", "").replace(")", "").replace("\\", "").trim();
				    	String selected=links.get(i).attr("class").trim();
				    	
				    		if(value!=""&&(selected.equals("")||selected.equals("selected")))
				    		{
				    			konut.doldur(value, selected);
				    		}
				    	
				    }
				    konut.puanHesapla();
				    konutlar.add(konut);
			    
				}
			} catch (MalformedURLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			finally {
				Collections.sort(konutlar,new KonutKarsilastir());

				for(int i=0;i<konutlar.size();i++)
				{
					konutlar.get(konutlar.size()-1-i).printScore();
				}
			}
		}
		  
		  }
	  private static String readAll(Reader rd) throws IOException {
		    StringBuilder sb = new StringBuilder();
		    int cp;
		    while ((cp = rd.read()) != -1) {
		      sb.append((char) cp);
		    }
		    return sb.toString();
		  }
	  
}
