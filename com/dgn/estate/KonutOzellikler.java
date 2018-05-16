package com.dgn.estate;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class KonutOzellikler {
	private String link="";
	private String name="";
	private String Il;
	private String Ilce;
	private String Mahalle;
	private double sure =10000.0;
	private double uzaklik = 100000.0;
	private int ucret=10000000;
	private double puan=-100;
	private boolean Buyuk_Fotograf=false;
	private boolean Video=false;
	private boolean Bati=false;
	private boolean Dogu=false;
	private boolean Guney=false;
	private boolean Kuzey=false;
	private boolean ADSL=false;
	private boolean Ahsap_Dograma=false;
	private boolean Akilli_Ev=false;
	private boolean Alarm_Hirsiz=false;
	private boolean Alarm_Yangin=false;
	private boolean Alaturka_Tuvalet=false;
	private boolean Amerikan_Mutfak=false;
	private boolean Ankastre_Firin=false;
	private boolean Asansor=false;
	private boolean Balkon=false;
	private boolean Barbeku=false;
	private boolean Beyaz_Esya=false;
	private boolean Boyali=false;
	private boolean Bulasik_Makinesi=false;
	private boolean Buzdolabi=false;
	private boolean Duvar_Kagidi=false;
	private boolean Dusakabin=false;
	private boolean Ebeveyn_Banyosu=false;
	private boolean Fiber_Internet=false;
	private boolean Firin=false;
	private boolean Giyinme_Odasi=false;
	private boolean Gomme_Dolap=false;
	private boolean Goruntulu_Diafon=false;
	private boolean Hilton_Banyo=false;
	private boolean Intercom_Sistemi=false;
	private boolean Isicam=false;
	private boolean Jakuzi=false;
	private boolean Kartonpiyer=false;
	private boolean Kiler=false;
	private boolean Klima=false;
	private boolean Laminat_Zemin=false;
	private boolean Marley=false;
	private boolean Mobilya=false;
	private boolean Mutfak_Ankastre=false;
	private boolean Mutfak_Laminat=false;
	private boolean Mutfak_Dogalgazi=false;
	private boolean PVC_Dograma=false;
	private boolean Panjur=false;
	private boolean Parke_Zemin=false;
	private boolean Sauna=false;
	private boolean Seramik_Zemin=false;
	private boolean Set_Ustu_Ocak=false;
	private boolean Spot_Aydinlatma=false;
	private boolean Teras=false;
	private boolean Vestiyer=false;
	private boolean WiFi=false;
	private boolean Camasir_Makinesi=false;
	private boolean Camasir_Odasi=false;
	private boolean Celik_Kapi=false;
	private boolean Sofben=false;
	private boolean Somine=false;
	private boolean Guvenlik=false;
	private boolean Hidrofor=false;
	private boolean Isi_Yalitim=false;
	private boolean Jenerator=false;
	private boolean Kablo_TV=false;
	private boolean Kapali_Garaj=false;
	private boolean Kapici=false;
	private boolean Kres=false;
	private boolean Otopark=false;
	private boolean Oyun_Parki=false;
	private boolean Ses_Yalitimi=false;
	private boolean Siding=false;
	private boolean Spor_Alani=false;
	private boolean Su_Deposu=false;
	private boolean Tenis_Kortu=false;
	private boolean Uydu=false;
	private boolean Yangin_Merdiveni=false;
	private boolean Yuzme_Havuzu_Acik=false;
	private boolean Yuzme_Havuzu_Kapali=false;
	private boolean Arac_Park_Yeri=false;
	private boolean Banyo=false;
	private boolean Genis_Koridor=false;
	private boolean Giris_Rampa=false;
	private boolean Merdiven=false;
	private boolean Mutfak=false;
	private boolean Oda_Kapisi=false;
	private boolean Park=false;
	private boolean Priz_Elektrik_Anahtari=false;
	private boolean Tutamak_Korkuluk=false;
	private boolean Tuvalet=false;
	private boolean Yuzme_Havuzu=false;
	private boolean Alisveris_Merkezi=false;
	private boolean Belediye=false;
	private boolean Cami=false;
	private boolean Cemevi=false;
	private boolean Denize_Sifir=false;
	private boolean Eczane=false;
	private boolean Eglence_Merkezi=false;
	private boolean Fuar=false;
	private boolean Hastane=false;
	private boolean Havra=false;
	private boolean Kilise=false;
	private boolean Lise=false;
	private boolean Market=false;
	private boolean Polis_Merkezi=false;
	private boolean Saglik_Ocagi=false;
	private boolean Semt_Pazari=false;
	private boolean Spor_Salonu=false;
	private boolean Universite=false;
	private boolean Ilkogretim=false;
	private boolean Itfaiye=false;
	private boolean Sehir_Merkezi=false;
	private boolean Anayol=false;
	private boolean Bogaz_Kopruleri=false;
	private boolean Cadde=false;
	private boolean Deniz_Otobusu=false;
	private boolean Dolmus=false;
	private boolean E5=false;
	private boolean Havaalani=false;
	private boolean Marmaray=false;
	private boolean Metro=false;
	private boolean Metrobus=false;
	private boolean Minibus=false;
	private boolean Otobus_Duragi=false;
	private boolean Sahil=false;
	private boolean TEM=false;
	private boolean Teleferik=false;
	private boolean Tramvay=false;
	private boolean Tren_Istasyonu=false;
	private boolean Iskele=false;
	private boolean Bogaz=false;
	private boolean Deniz=false;
	private boolean Doga=false;
	private boolean Gol=false;
	private boolean Havuz=false;
	private boolean Sehir=false;
	private boolean Ara_Kat=false;
	private boolean Ara_Kat_Dubleks=false;
	private boolean Bahce_Dubleksi=false;
	private boolean Bahce_Kati=false;
	private boolean Bahceli=false;
	private boolean Kat_Dubleksi=false;
	private boolean Mustakil_Girisli=false;
	private boolean Ters_Dubleks=false;
	private boolean Tripleks=false;
	private boolean Cati_Dubleksi=false;
	public boolean getBuyuk_Fotograf() {
		return Buyuk_Fotograf;
	}
	public void setBuyuk_Fotograf(boolean buyuk_Fotograf) {
		Buyuk_Fotograf = buyuk_Fotograf;
	}
	public boolean getVideo() {
		return Video;
	}
	public void setVideo(boolean video) {
		Video = video;
	}
	public boolean getBati() {
		return Bati;
	}
	public void setBati(boolean bati) {
		Bati = bati;
	}
	public boolean getDogu() {
		return Dogu;
	}
	public void setDogu(boolean dogu) {
		Dogu = dogu;
	}
	public boolean getGuney() {
		return Guney;
	}
	public void setGuney(boolean guney) {
		Guney = guney;
	}
	public boolean getKuzey() {
		return Kuzey;
	}
	public void setKuzey(boolean kuzey) {
		Kuzey = kuzey;
	}
	public boolean getADSL() {
		return ADSL;
	}
	public void setADSL(boolean aDSL) {
		ADSL = aDSL;
	}
	public boolean getAhsap_Dograma() {
		return Ahsap_Dograma;
	}
	public void setAhsap_Dograma(boolean ahsap_Dograma) {
		Ahsap_Dograma = ahsap_Dograma;
	}
	public boolean getAkilli_Ev() {
		return Akilli_Ev;
	}
	public void setAkilli_Ev(boolean akilli_Ev) {
		Akilli_Ev = akilli_Ev;
	}
	public boolean getAlarm_Hirsiz() {
		return Alarm_Hirsiz;
	}
	public void setAlarm_Hirsiz(boolean alarm_Hirsiz) {
		Alarm_Hirsiz = alarm_Hirsiz;
	}
	public boolean getAlarm_Yangin() {
		return Alarm_Yangin;
	}
	public void setAlarm_Yangin(boolean alarm_Yangin) {
		Alarm_Yangin = alarm_Yangin;
	}
	public boolean getAlaturka_Tuvalet() {
		return Alaturka_Tuvalet;
	}
	public void setAlaturka_Tuvalet(boolean alaturka_Tuvalet) {
		Alaturka_Tuvalet = alaturka_Tuvalet;
	}
	public boolean getAmerikan_Mutfak() {
		return Amerikan_Mutfak;
	}
	public void setAmerikan_Mutfak(boolean amerikan_Mutfak) {
		Amerikan_Mutfak = amerikan_Mutfak;
	}
	public boolean getAnkastre_Firin() {
		return Ankastre_Firin;
	}
	public void setAnkastre_Firin(boolean ankastre_Firin) {
		Ankastre_Firin = ankastre_Firin;
	}
	public boolean getAsansor() {
		return Asansor;
	}
	public void setAsansor(boolean asansor) {
		Asansor = asansor;
	}
	public boolean getBalkon() {
		return Balkon;
	}
	public void setBalkon(boolean balkon) {
		Balkon = balkon;
	}
	public boolean getBarbeku() {
		return Barbeku;
	}
	public void setBarbeku(boolean barbeku) {
		Barbeku = barbeku;
	}
	public boolean getBeyaz_Esya() {
		return Beyaz_Esya;
	}
	public void setBeyaz_Esya(boolean beyaz_Esya) {
		Beyaz_Esya = beyaz_Esya;
	}
	public boolean getBoyali() {
		return Boyali;
	}
	public void setBoyali(boolean boyali) {
		Boyali = boyali;
	}
	public boolean getBulasik_Makinesi() {
		return Bulasik_Makinesi;
	}
	public void setBulasik_Makinesi(boolean bulasik_Makinesi) {
		Bulasik_Makinesi = bulasik_Makinesi;
	}
	public boolean getBuzdolabi() {
		return Buzdolabi;
	}
	public void setBuzdolabi(boolean buzdolabi) {
		Buzdolabi = buzdolabi;
	}
	public boolean getDuvar_Kagidi() {
		return Duvar_Kagidi;
	}
	public void setDuvar_Kagidi(boolean duvar_Kagidi) {
		Duvar_Kagidi = duvar_Kagidi;
	}
	public boolean getDusakabin() {
		return Dusakabin;
	}
	public void setDusakabin(boolean dusakabin) {
		Dusakabin = dusakabin;
	}
	public boolean getEbeveyn_Banyosu() {
		return Ebeveyn_Banyosu;
	}
	public void setEbeveyn_Banyosu(boolean ebeveyn_Banyosu) {
		Ebeveyn_Banyosu = ebeveyn_Banyosu;
	}
	public boolean getFiber_Internet() {
		return Fiber_Internet;
	}
	public void setFiber_Internet(boolean fiber_Internet) {
		Fiber_Internet = fiber_Internet;
	}
	public boolean getFirin() {
		return Firin;
	}
	public void setFirin(boolean firin) {
		Firin = firin;
	}
	public boolean getGiyinme_Odasi() {
		return Giyinme_Odasi;
	}
	public void setGiyinme_Odasi(boolean giyinme_Odasi) {
		Giyinme_Odasi = giyinme_Odasi;
	}
	public boolean getGomme_Dolap() {
		return Gomme_Dolap;
	}
	public void setGomme_Dolap(boolean gomme_Dolap) {
		Gomme_Dolap = gomme_Dolap;
	}
	public boolean getGoruntulu_Diafon() {
		return Goruntulu_Diafon;
	}
	public void setGoruntulu_Diafon(boolean goruntulu_Diafon) {
		Goruntulu_Diafon = goruntulu_Diafon;
	}
	public boolean getHilton_Banyo() {
		return Hilton_Banyo;
	}
	public void setHilton_Banyo(boolean hilton_Banyo) {
		Hilton_Banyo = hilton_Banyo;
	}
	public boolean getIntercom_Sistemi() {
		return Intercom_Sistemi;
	}
	public void setIntercom_Sistemi(boolean intercom_Sistemi) {
		Intercom_Sistemi = intercom_Sistemi;
	}
	public boolean getIsicam() {
		return Isicam;
	}
	public void setIsicam(boolean isicam) {
		Isicam = isicam;
	}
	public boolean getJakuzi() {
		return Jakuzi;
	}
	public void setJakuzi(boolean jakuzi) {
		Jakuzi = jakuzi;
	}
	public boolean getKartonpiyer() {
		return Kartonpiyer;
	}
	public void setKartonpiyer(boolean kartonpiyer) {
		Kartonpiyer = kartonpiyer;
	}
	public boolean getKiler() {
		return Kiler;
	}
	public void setKiler(boolean kiler) {
		Kiler = kiler;
	}
	public boolean getKlima() {
		return Klima;
	}
	public void setKlima(boolean klima) {
		Klima = klima;
	}
	public boolean getLaminat_Zemin() {
		return Laminat_Zemin;
	}
	public void setLaminat_Zemin(boolean laminat_Zemin) {
		Laminat_Zemin = laminat_Zemin;
	}
	public boolean getMarley() {
		return Marley;
	}
	public void setMarley(boolean marley) {
		Marley = marley;
	}
	public boolean getMobilya() {
		return Mobilya;
	}
	public void setMobilya(boolean mobilya) {
		Mobilya = mobilya;
	}
	public boolean getMutfak_Ankastre() {
		return Mutfak_Ankastre;
	}
	public void setMutfak_Ankastre(boolean mutfak_Ankastre) {
		Mutfak_Ankastre = mutfak_Ankastre;
	}
	public boolean getMutfak_Laminat() {
		return Mutfak_Laminat;
	}
	public void setMutfak_Laminat(boolean mutfak_Laminat) {
		Mutfak_Laminat = mutfak_Laminat;
	}
	public boolean getMutfak_Dogalgazi() {
		return Mutfak_Dogalgazi;
	}
	public void setMutfak_Dogalgazi(boolean mutfak_Dogalgazi) {
		Mutfak_Dogalgazi = mutfak_Dogalgazi;
	}
	public boolean getPVC_Dograma() {
		return PVC_Dograma;
	}
	public void setPVC_Dograma(boolean pVC_Dograma) {
		PVC_Dograma = pVC_Dograma;
	}
	public boolean getPanjur() {
		return Panjur;
	}
	public void setPanjur(boolean panjur) {
		Panjur = panjur;
	}
	public boolean getParke_Zemin() {
		return Parke_Zemin;
	}
	public void setParke_Zemin(boolean parke_Zemin) {
		Parke_Zemin = parke_Zemin;
	}
	public boolean getSauna() {
		return Sauna;
	}
	public void setSauna(boolean sauna) {
		Sauna = sauna;
	}
	public boolean getSeramik_Zemin() {
		return Seramik_Zemin;
	}
	public void setSeramik_Zemin(boolean seramik_Zemin) {
		Seramik_Zemin = seramik_Zemin;
	}
	public boolean getSet_Ustu_Ocak() {
		return Set_Ustu_Ocak;
	}
	public void setSet_Ustu_Ocak(boolean set_Ustu_Ocak) {
		Set_Ustu_Ocak = set_Ustu_Ocak;
	}
	public boolean getSpot_Aydinlatma() {
		return Spot_Aydinlatma;
	}
	public void setSpot_Aydinlatma(boolean spot_Aydinlatma) {
		Spot_Aydinlatma = spot_Aydinlatma;
	}
	public boolean getTeras() {
		return Teras;
	}
	public void setTeras(boolean teras) {
		Teras = teras;
	}
	public boolean getVestiyer() {
		return Vestiyer;
	}
	public void setVestiyer(boolean vestiyer) {
		Vestiyer = vestiyer;
	}
	public boolean getWiFi() {
		return WiFi;
	}
	public void setWiFi(boolean wiFi) {
		WiFi = wiFi;
	}
	public boolean getCamasir_Makinesi() {
		return Camasir_Makinesi;
	}
	public void setCamasir_Makinesi(boolean camasir_Makinesi) {
		Camasir_Makinesi = camasir_Makinesi;
	}
	public boolean getCamasir_Odasi() {
		return Camasir_Odasi;
	}
	public void setCamasir_Odasi(boolean camasir_Odasi) {
		Camasir_Odasi = camasir_Odasi;
	}
	public boolean getCelik_Kapi() {
		return Celik_Kapi;
	}
	public void setCelik_Kapi(boolean celik_Kapi) {
		Celik_Kapi = celik_Kapi;
	}
	public boolean getSofben() {
		return Sofben;
	}
	public void setSofben(boolean sofben) {
		Sofben = sofben;
	}
	public boolean getSomine() {
		return Somine;
	}
	public void setSomine(boolean somine) {
		Somine = somine;
	}
	public boolean getGuvenlik() {
		return Guvenlik;
	}
	public void setGuvenlik(boolean guvenlik) {
		Guvenlik = guvenlik;
	}
	public boolean getHidrofor() {
		return Hidrofor;
	}
	public void setHidrofor(boolean hidrofor) {
		Hidrofor = hidrofor;
	}
	public boolean getIsi_Yalitim() {
		return Isi_Yalitim;
	}
	public void setIsi_Yalitim(boolean isi_Yalitim) {
		Isi_Yalitim = isi_Yalitim;
	}
	public boolean getJenerator() {
		return Jenerator;
	}
	public void setJenerator(boolean jenerator) {
		Jenerator = jenerator;
	}
	public boolean getKablo_TV() {
		return Kablo_TV;
	}
	public void setKablo_TV(boolean kablo_TV) {
		Kablo_TV = kablo_TV;
	}
	public boolean getKapali_Garaj() {
		return Kapali_Garaj;
	}
	public void setKapali_Garaj(boolean kapali_Garaj) {
		Kapali_Garaj = kapali_Garaj;
	}
	public boolean getKapici() {
		return Kapici;
	}
	public void setKapici(boolean kapici) {
		Kapici = kapici;
	}
	public boolean getKres() {
		return Kres;
	}
	public void setKres(boolean kres) {
		Kres = kres;
	}
	public boolean getOtopark() {
		return Otopark;
	}
	public void setOtopark(boolean otopark) {
		Otopark = otopark;
	}
	public boolean getOyun_Parki() {
		return Oyun_Parki;
	}
	public void setOyun_Parki(boolean oyun_Parki) {
		Oyun_Parki = oyun_Parki;
	}
	public boolean getSes_Yalitimi() {
		return Ses_Yalitimi;
	}
	public void setSes_Yalitimi(boolean ses_Yalitimi) {
		Ses_Yalitimi = ses_Yalitimi;
	}
	public boolean getSiding() {
		return Siding;
	}
	public void setSiding(boolean siding) {
		Siding = siding;
	}
	public boolean getSpor_Alani() {
		return Spor_Alani;
	}
	public void setSpor_Alani(boolean spor_Alani) {
		Spor_Alani = spor_Alani;
	}
	public boolean getSu_Deposu() {
		return Su_Deposu;
	}
	public void setSu_Deposu(boolean su_Deposu) {
		Su_Deposu = su_Deposu;
	}
	public boolean getTenis_Kortu() {
		return Tenis_Kortu;
	}
	public void setTenis_Kortu(boolean tenis_Kortu) {
		Tenis_Kortu = tenis_Kortu;
	}
	public boolean getUydu() {
		return Uydu;
	}
	public void setUydu(boolean uydu) {
		Uydu = uydu;
	}
	public boolean getYangin_Merdiveni() {
		return Yangin_Merdiveni;
	}
	public void setYangin_Merdiveni(boolean yangin_Merdiveni) {
		Yangin_Merdiveni = yangin_Merdiveni;
	}
	public boolean getYuzme_Havuzu_Acik() {
		return Yuzme_Havuzu_Acik;
	}
	public void setYuzme_Havuzu_Acik(boolean yuzme_Havuzu_Acik) {
		Yuzme_Havuzu_Acik = yuzme_Havuzu_Acik;
	}
	public boolean getYuzme_Havuzu_Kapali() {
		return Yuzme_Havuzu_Kapali;
	}
	public void setYuzme_Havuzu_Kapali(boolean yuzme_Havuzu_Kapali) {
		Yuzme_Havuzu_Kapali = yuzme_Havuzu_Kapali;
	}
	public boolean getArac_Park_Yeri() {
		return Arac_Park_Yeri;
	}
	public void setArac_Park_Yeri(boolean arac_Park_Yeri) {
		Arac_Park_Yeri = arac_Park_Yeri;
	}
	public boolean getBanyo() {
		return Banyo;
	}
	public void setBanyo(boolean banyo) {
		Banyo = banyo;
	}
	public boolean getGenis_Koridor() {
		return Genis_Koridor;
	}
	public void setGenis_Koridor(boolean genis_Koridor) {
		Genis_Koridor = genis_Koridor;
	}
	public boolean getGiris_Rampa() {
		return Giris_Rampa;
	}
	public void setGiris_Rampa(boolean giris_Rampa) {
		Giris_Rampa = giris_Rampa;
	}
	public boolean getMerdiven() {
		return Merdiven;
	}
	public void setMerdiven(boolean merdiven) {
		Merdiven = merdiven;
	}
	public boolean getMutfak() {
		return Mutfak;
	}
	public void setMutfak(boolean mutfak) {
		Mutfak = mutfak;
	}
	public boolean getOda_Kapisi() {
		return Oda_Kapisi;
	}
	public void setOda_Kapisi(boolean oda_Kapisi) {
		Oda_Kapisi = oda_Kapisi;
	}
	public boolean getPark() {
		return Park;
	}
	public void setPark(boolean park) {
		Park = park;
	}
	public boolean getPriz_Elektrik_Anahtari() {
		return Priz_Elektrik_Anahtari;
	}
	public void setPriz_Elektrik_Anahtari(boolean priz_Elektrik_Anahtari) {
		Priz_Elektrik_Anahtari = priz_Elektrik_Anahtari;
	}
	public boolean getTutamak_Korkuluk() {
		return Tutamak_Korkuluk;
	}
	public void setTutamak_Korkuluk(boolean tutamak_Korkuluk) {
		Tutamak_Korkuluk = tutamak_Korkuluk;
	}
	public boolean getTuvalet() {
		return Tuvalet;
	}
	public void setTuvalet(boolean tuvalet) {
		Tuvalet = tuvalet;
	}
	public boolean getYuzme_Havuzu() {
		return Yuzme_Havuzu;
	}
	public void setYuzme_Havuzu(boolean yuzme_Havuzu) {
		Yuzme_Havuzu = yuzme_Havuzu;
	}
	public boolean getAlisveris_Merkezi() {
		return Alisveris_Merkezi;
	}
	public void setAlisveris_Merkezi(boolean alisveris_Merkezi) {
		Alisveris_Merkezi = alisveris_Merkezi;
	}
	public boolean getBelediye() {
		return Belediye;
	}
	public void setBelediye(boolean belediye) {
		Belediye = belediye;
	}
	public boolean getCami() {
		return Cami;
	}
	public void setCami(boolean cami) {
		Cami = cami;
	}
	public boolean getCemevi() {
		return Cemevi;
	}
	public void setCemevi(boolean cemevi) {
		Cemevi = cemevi;
	}
	public boolean getDenize_Sifir() {
		return Denize_Sifir;
	}
	public void setDenize_Sifir(boolean denize_Sifir) {
		Denize_Sifir = denize_Sifir;
	}
	public boolean getEczane() {
		return Eczane;
	}
	public void setEczane(boolean eczane) {
		Eczane = eczane;
	}
	public boolean getEglence_Merkezi() {
		return Eglence_Merkezi;
	}
	public void setEglence_Merkezi(boolean eglence_Merkezi) {
		Eglence_Merkezi = eglence_Merkezi;
	}
	public boolean getFuar() {
		return Fuar;
	}
	public void setFuar(boolean fuar) {
		Fuar = fuar;
	}
	public boolean getHastane() {
		return Hastane;
	}
	public void setHastane(boolean hastane) {
		Hastane = hastane;
	}
	public boolean getHavra() {
		return Havra;
	}
	public void setHavra(boolean havra) {
		Havra = havra;
	}
	public boolean getKilise() {
		return Kilise;
	}
	public void setKilise(boolean kilise) {
		Kilise = kilise;
	}
	public boolean getLise() {
		return Lise;
	}
	public void setLise(boolean lise) {
		Lise = lise;
	}
	public boolean getMarket() {
		return Market;
	}
	public void setMarket(boolean market) {
		Market = market;
	}
	public boolean getPolis_Merkezi() {
		return Polis_Merkezi;
	}
	public void setPolis_Merkezi(boolean polis_Merkezi) {
		Polis_Merkezi = polis_Merkezi;
	}
	public boolean getSaglik_Ocagi() {
		return Saglik_Ocagi;
	}
	public void setSaglik_Ocagi(boolean saglik_Ocagi) {
		Saglik_Ocagi = saglik_Ocagi;
	}
	public boolean getSemt_Pazari() {
		return Semt_Pazari;
	}
	public void setSemt_Pazari(boolean semt_Pazari) {
		Semt_Pazari = semt_Pazari;
	}
	public boolean getSpor_Salonu() {
		return Spor_Salonu;
	}
	public void setSpor_Salonu(boolean spor_Salonu) {
		Spor_Salonu = spor_Salonu;
	}
	public boolean getUniversite() {
		return Universite;
	}
	public void setUniversite(boolean universite) {
		Universite = universite;
	}
	public boolean getIlkogretim() {
		return Ilkogretim;
	}
	public void setIlkogretim(boolean ilkogretim) {
		Ilkogretim = ilkogretim;
	}
	public boolean getItfaiye() {
		return Itfaiye;
	}
	public void setItfaiye(boolean itfaiye) {
		Itfaiye = itfaiye;
	}
	public boolean getSehir_Merkezi() {
		return Sehir_Merkezi;
	}
	public void setSehir_Merkezi(boolean sehir_Merkezi) {
		Sehir_Merkezi = sehir_Merkezi;
	}
	public boolean getAnayol() {
		return Anayol;
	}
	public void setAnayol(boolean anayol) {
		Anayol = anayol;
	}
	public boolean getBogaz_Kopruleri() {
		return Bogaz_Kopruleri;
	}
	public void setBogaz_Kopruleri(boolean bogaz_Kopruleri) {
		Bogaz_Kopruleri = bogaz_Kopruleri;
	}
	public boolean getCadde() {
		return Cadde;
	}
	public void setCadde(boolean cadde) {
		Cadde = cadde;
	}
	public boolean getDeniz_Otobusu() {
		return Deniz_Otobusu;
	}
	public void setDeniz_Otobusu(boolean deniz_Otobusu) {
		Deniz_Otobusu = deniz_Otobusu;
	}
	public boolean getDolmus() {
		return Dolmus;
	}
	public void setDolmus(boolean dolmus) {
		Dolmus = dolmus;
	}
	public boolean getE5() {
		return E5;
	}
	public void setE5(boolean e5) {
		E5 = e5;
	}
	public boolean getHavaalani() {
		return Havaalani;
	}
	public void setHavaalani(boolean havaalani) {
		Havaalani = havaalani;
	}
	public boolean getMarmaray() {
		return Marmaray;
	}
	public void setMarmaray(boolean marmaray) {
		Marmaray = marmaray;
	}
	public boolean getMetro() {
		return Metro;
	}
	public void setMetro(boolean metro) {
		Metro = metro;
	}
	public boolean getMetrobus() {
		return Metrobus;
	}
	public void setMetrobus(boolean metrobus) {
		Metrobus = metrobus;
	}
	public boolean getMinibus() {
		return Minibus;
	}
	public void setMinibus(boolean minibus) {
		Minibus = minibus;
	}
	public boolean getOtobus_Duragi() {
		return Otobus_Duragi;
	}
	public void setOtobus_Duragi(boolean otobus_Duragi) {
		Otobus_Duragi = otobus_Duragi;
	}
	public boolean getSahil() {
		return Sahil;
	}
	public void setSahil(boolean sahil) {
		Sahil = sahil;
	}
	public boolean getTEM() {
		return TEM;
	}
	public void setTEM(boolean tEM) {
		TEM = tEM;
	}
	public boolean getTeleferik() {
		return Teleferik;
	}
	public void setTeleferik(boolean teleferik) {
		Teleferik = teleferik;
	}
	public boolean getTramvay() {
		return Tramvay;
	}
	public void setTramvay(boolean tramvay) {
		Tramvay = tramvay;
	}
	public boolean getTren_Istasyonu() {
		return Tren_Istasyonu;
	}
	public void setTren_Istasyonu(boolean tren_Istasyonu) {
		Tren_Istasyonu = tren_Istasyonu;
	}
	public boolean getIskele() {
		return Iskele;
	}
	public void setIskele(boolean iskele) {
		Iskele = iskele;
	}
	public boolean getBogaz() {
		return Bogaz;
	}
	public void setBogaz(boolean bogaz) {
		Bogaz = bogaz;
	}
	public boolean getDeniz() {
		return Deniz;
	}
	public void setDeniz(boolean deniz) {
		Deniz = deniz;
	}
	public boolean getDoga() {
		return Doga;
	}
	public void setDoga(boolean doga) {
		Doga = doga;
	}
	public boolean getGol() {
		return Gol;
	}
	public void setGol(boolean gol) {
		Gol = gol;
	}
	public boolean getHavuz() {
		return Havuz;
	}
	public void setHavuz(boolean havuz) {
		Havuz = havuz;
	}
	public boolean getSehir() {
		return Sehir;
	}
	public void setSehir(boolean sehir) {
		Sehir = sehir;
	}
	public boolean getAra_Kat() {
		return Ara_Kat;
	}
	public void setAra_Kat(boolean ara_Kat) {
		Ara_Kat = ara_Kat;
	}
	public boolean getAra_Kat_Dubleks() {
		return Ara_Kat_Dubleks;
	}
	public void setAra_Kat_Dubleks(boolean ara_Kat_Dubleks) {
		Ara_Kat_Dubleks = ara_Kat_Dubleks;
	}
	public boolean getBahce_Dubleksi() {
		return Bahce_Dubleksi;
	}
	public void setBahce_Dubleksi(boolean bahce_Dubleksi) {
		Bahce_Dubleksi = bahce_Dubleksi;
	}
	public boolean getBahce_Kati() {
		return Bahce_Kati;
	}
	public void setBahce_Kati(boolean bahce_Kati) {
		Bahce_Kati = bahce_Kati;
	}
	public boolean getBahceli() {
		return Bahceli;
	}
	public void setBahceli(boolean bahceli) {
		Bahceli = bahceli;
	}
	public boolean getKat_Dubleksi() {
		return Kat_Dubleksi;
	}
	public void setKat_Dubleksi(boolean kat_Dubleksi) {
		Kat_Dubleksi = kat_Dubleksi;
	}
	public boolean getMustakil_Girisli() {
		return Mustakil_Girisli;
	}
	public void setMustakil_Girisli(boolean mustakil_Girisli) {
		Mustakil_Girisli = mustakil_Girisli;
	}
	public boolean getTers_Dubleks() {
		return Ters_Dubleks;
	}
	public void setTers_Dubleks(boolean ters_Dubleks) {
		Ters_Dubleks = ters_Dubleks;
	}
	public boolean getTripleks() {
		return Tripleks;
	}
	public void setTripleks(boolean tripleks) {
		Tripleks = tripleks;
	}
	public boolean getCati_Dubleksi() {
		return Cati_Dubleksi;
	}
	public void setCati_Dubleksi(boolean cati_Dubleksi) {
		Cati_Dubleksi = cati_Dubleksi;
	}
	
	public void doldur(String value,String selected)
	{
		if( value.equals("BuyukFotograf"))
			if(selected.trim().equals("selected"))Buyuk_Fotograf=true;
			if( value.equals("Video"))
			if(selected.trim().equals("selected"))Video=true;
			if( value.equals("Bati"))
			if(selected.trim().equals("selected"))Bati=true;
			if( value.equals("Dogu"))
			if(selected.trim().equals("selected"))Dogu=true;
			if( value.equals("Guney"))
			if(selected.trim().equals("selected"))Guney=true;
			if( value.equals("Kuzey"))
			if(selected.trim().equals("selected"))Kuzey=true;
			if( value.equals("ADSL"))
			if(selected.trim().equals("selected"))ADSL=true;
			if( value.equals("AhsapDograma"))
			if(selected.trim().equals("selected"))Ahsap_Dograma=true;
			if( value.equals("AkilliEv"))
			if(selected.trim().equals("selected"))Akilli_Ev=true;
			if( value.equals("AlarmHirsiz"))
			if(selected.trim().equals("selected"))Alarm_Hirsiz=true;
			if( value.equals("AlarmYangin"))
			if(selected.trim().equals("selected"))Alarm_Yangin=true;
			if( value.equals("AlaturkaTuvalet"))
			if(selected.trim().equals("selected"))Alaturka_Tuvalet=true;
			if( value.equals("AmerikanMutfak"))
			if(selected.trim().equals("selected"))Amerikan_Mutfak=true;
			if( value.equals("AnkastreFirin"))
			if(selected.trim().equals("selected"))Ankastre_Firin=true;
			if( value.equals("Asansor"))
			if(selected.trim().equals("selected"))Asansor=true;
			if( value.equals("Balkon"))
			if(selected.trim().equals("selected"))Balkon=true;
			if( value.equals("Barbeku"))
			if(selected.trim().equals("selected"))Barbeku=true;
			if( value.equals("BeyazEsya"))
			if(selected.trim().equals("selected"))Beyaz_Esya=true;
			if( value.equals("Boyali"))
			if(selected.trim().equals("selected"))Boyali=true;
			if( value.equals("BulasikMakinesi"))
			if(selected.trim().equals("selected"))Bulasik_Makinesi=true;
			if( value.equals("Buzdolabi"))
			if(selected.trim().equals("selected"))Buzdolabi=true;
			if( value.equals("DuvarKagidi"))
			if(selected.trim().equals("selected"))Duvar_Kagidi=true;
			if( value.equals("Dusakabin"))
			if(selected.trim().equals("selected"))Dusakabin=true;
			if( value.equals("EbeveynBanyosu"))
			if(selected.trim().equals("selected"))Ebeveyn_Banyosu=true;
			if( value.equals("FiberInternet"))
			if(selected.trim().equals("selected"))Fiber_Internet=true;
			if( value.equals("Firin"))
			if(selected.trim().equals("selected"))Firin=true;
			if( value.equals("GiyinmeOdasi"))
			if(selected.trim().equals("selected"))Giyinme_Odasi=true;
			if( value.equals("GommeDolap"))
			if(selected.trim().equals("selected"))Gomme_Dolap=true;
			if( value.equals("GoruntuluDiafon"))
			if(selected.trim().equals("selected"))Goruntulu_Diafon=true;
			if( value.equals("HiltonBanyo"))
			if(selected.trim().equals("selected"))Hilton_Banyo=true;
			if( value.equals("IntercomSistemi"))
			if(selected.trim().equals("selected"))Intercom_Sistemi=true;
			if( value.equals("Isicam"))
			if(selected.trim().equals("selected"))Isicam=true;
			if( value.equals("Jakuzi"))
			if(selected.trim().equals("selected"))Jakuzi=true;
			if( value.equals("Kartonpiyer"))
			if(selected.trim().equals("selected"))Kartonpiyer=true;
			if( value.equals("Kiler"))
			if(selected.trim().equals("selected"))Kiler=true;
			if( value.equals("Klima"))
			if(selected.trim().equals("selected"))Klima=true;
			if( value.equals("LaminatZemin"))
			if(selected.trim().equals("selected"))Laminat_Zemin=true;
			if( value.equals("Marley"))
			if(selected.trim().equals("selected"))Marley=true;
			if( value.equals("Mobilya"))
			if(selected.trim().equals("selected"))Mobilya=true;
			if( value.equals("MutfakAnkastre"))
			if(selected.trim().equals("selected"))Mutfak_Ankastre=true;
			if( value.equals("MutfakLaminat"))
			if(selected.trim().equals("selected"))Mutfak_Laminat=true;
			if( value.equals("MutfakDogalgazi"))
			if(selected.trim().equals("selected"))Mutfak_Dogalgazi=true;
			if( value.equals("PVCDograma"))
			if(selected.trim().equals("selected"))PVC_Dograma=true;
			if( value.equals("Panjur"))
			if(selected.trim().equals("selected"))Panjur=true;
			if( value.equals("ParkeZemin"))
			if(selected.trim().equals("selected"))Parke_Zemin=true;
			if( value.equals("Sauna"))
			if(selected.trim().equals("selected"))Sauna=true;
			if( value.equals("SeramikZemin"))
			if(selected.trim().equals("selected"))Seramik_Zemin=true;
			if( value.equals("SetUstuOcak"))
			if(selected.trim().equals("selected"))Set_Ustu_Ocak=true;
			if( value.equals("SpotAydinlatma"))
			if(selected.trim().equals("selected"))Spot_Aydinlatma=true;
			if( value.equals("Teras"))
			if(selected.trim().equals("selected"))Teras=true;
			if( value.equals("Vestiyer"))
			if(selected.trim().equals("selected"))Vestiyer=true;
			if( value.equals("WiFi"))
			if(selected.trim().equals("selected"))WiFi=true;
			if( value.equals("CamasirMakinesi"))
			if(selected.trim().equals("selected"))Camasir_Makinesi=true;
			if( value.equals("CamasirOdasi"))
			if(selected.trim().equals("selected"))Camasir_Odasi=true;
			if( value.equals("CelikKapi"))
			if(selected.trim().equals("selected"))Celik_Kapi=true;
			if( value.equals("Sofben"))
			if(selected.trim().equals("selected"))Sofben=true;
			if( value.equals("Somine"))
			if(selected.trim().equals("selected"))Somine=true;
			if( value.equals("Asansor"))
			if(selected.trim().equals("selected"))Asansor=true;
			if( value.equals("Guvenlik"))
			if(selected.trim().equals("selected"))Guvenlik=true;
			if( value.equals("Hidrofor"))
			if(selected.trim().equals("selected"))Hidrofor=true;
			if( value.equals("IsiYalitim"))
			if(selected.trim().equals("selected"))Isi_Yalitim=true;
			if( value.equals("Jenerator"))
			if(selected.trim().equals("selected"))Jenerator=true;
			if( value.equals("KabloTV"))
			if(selected.trim().equals("selected"))Kablo_TV=true;
			if( value.equals("KapaliGaraj"))
			if(selected.trim().equals("selected"))Kapali_Garaj=true;
			if( value.equals("Kapici"))
			if(selected.trim().equals("selected"))Kapici=true;
			if( value.equals("Kres"))
			if(selected.trim().equals("selected"))Kres=true;
			if( value.equals("Otopark"))
			if(selected.trim().equals("selected"))Otopark=true;
			if( value.equals("Oyun_Parki"))
			if(selected.trim().equals("selected"))Oyun_Parki=true;
			if( value.equals("SesYalitimi"))
			if(selected.trim().equals("selected"))Ses_Yalitimi=true;
			if( value.equals("Siding"))
			if(selected.trim().equals("selected"))Siding=true;
			if( value.equals("SporAlani"))
			if(selected.trim().equals("selected"))Spor_Alani=true;
			if( value.equals("SuDeposu"))
			if(selected.trim().equals("selected"))Su_Deposu=true;
			if( value.equals("TenisKortu"))
			if(selected.trim().equals("selected"))Tenis_Kortu=true;
			if( value.equals("Uydu"))
			if(selected.trim().equals("selected"))Uydu=true;
			if( value.equals("YanginMerdiveni"))
			if(selected.trim().equals("selected"))Yangin_Merdiveni=true;
			if( value.equals("YuzmeHavuzuAcik"))
			if(selected.trim().equals("selected"))Yuzme_Havuzu_Acik=true;
			if( value.equals("YuzmeHavuzuKapali"))
			if(selected.trim().equals("selected"))Yuzme_Havuzu_Kapali=true;
			if( value.equals("AracParkYeri"))
			if(selected.trim().equals("selected"))Arac_Park_Yeri=true;
			if( value.equals("Asansor"))
			if(selected.trim().equals("selected"))Asansor=true;
			if( value.equals("Banyo"))
			if(selected.trim().equals("selected"))Banyo=true;
			if( value.equals("Genis_Koridor"))
			if(selected.trim().equals("selected"))Genis_Koridor=true;
			if( value.equals("Merdiven"))
			if(selected.trim().equals("selected"))Merdiven=true;
			if( value.equals("Mutfak"))
			if(selected.trim().equals("selected"))Mutfak=true;
			if( value.equals("Oda_Kapisi"))
			if(selected.trim().equals("selected"))Oda_Kapisi=true;
			if( value.equals("Park"))
			if(selected.trim().equals("selected"))Park=true;
			if( value.equals("Tuvalet"))
			if(selected.trim().equals("selected"))Tuvalet=true;
			if( value.equals("YuzmeHavuzu"))
			if(selected.trim().equals("selected"))Yuzme_Havuzu=true;
			if( value.equals("Alisveris_Merkezi"))
			if(selected.trim().equals("selected"))Alisveris_Merkezi=true;
			if( value.equals("Belediye"))
			if(selected.trim().equals("selected"))Belediye=true;
			if( value.equals("Cami"))
			if(selected.trim().equals("selected"))Cami=true;
			if( value.equals("Cemevi"))
			if(selected.trim().equals("selected"))Cemevi=true;
			if( value.equals("Denize_Sifir"))
			if(selected.trim().equals("selected"))Denize_Sifir=true;
			if( value.equals("Eczane"))
			if(selected.trim().equals("selected"))Eczane=true;
			if( value.equals("Eglence_Merkezi"))
			if(selected.trim().equals("selected"))Eglence_Merkezi=true;
			if( value.equals("Fuar"))
			if(selected.trim().equals("selected"))Fuar=true;
			if( value.equals("Hastane"))
			if(selected.trim().equals("selected"))Hastane=true;
			if( value.equals("Havra"))
			if(selected.trim().equals("selected"))Havra=true;
			if( value.equals("Kilise"))
			if(selected.trim().equals("selected"))Kilise=true;
			if( value.equals("Lise"))
			if(selected.trim().equals("selected"))Lise=true;
			if( value.equals("Market"))
			if(selected.trim().equals("selected"))Market=true;
			if( value.equals("Park"))
			if(selected.trim().equals("selected"))Park=true;
			if( value.equals("Polis_Merkezi"))
			if(selected.trim().equals("selected"))Polis_Merkezi=true;
			if( value.equals("Saglik_Ocagi"))
			if(selected.trim().equals("selected"))Saglik_Ocagi=true;
			if( value.equals("Semt_Pazari"))
			if(selected.trim().equals("selected"))Semt_Pazari=true;
			if( value.equals("SporSalonu"))
			if(selected.trim().equals("selected"))Spor_Salonu=true;
			if( value.equals("Universite"))
			if(selected.trim().equals("selected"))Universite=true;
			if( value.equals("Ilkogretim"))
			if(selected.trim().equals("selected"))Ilkogretim=true;
			if( value.equals("Itfaiye"))
			if(selected.trim().equals("selected"))Itfaiye=true;
			if( value.equals("Sehir_Merkezi"))
			if(selected.trim().equals("selected"))Sehir_Merkezi=true;
			if( value.equals("Anayol"))
			if(selected.trim().equals("selected"))Anayol=true;
			if( value.equals("Bogaz_Kopruleri"))
			if(selected.trim().equals("selected"))Bogaz_Kopruleri=true;
			if( value.equals("Cadde"))
			if(selected.trim().equals("selected"))Cadde=true;
			if( value.equals("Deniz_Otobusu"))
			if(selected.trim().equals("selected"))Deniz_Otobusu=true;
			if( value.equals("Dolmus"))
			if(selected.trim().equals("selected"))Dolmus=true;
			if( value.equals("E5"))
			if(selected.trim().equals("selected"))E5=true;
			if( value.equals("Havaalani"))
			if(selected.trim().equals("selected"))Havaalani=true;
			if( value.equals("Marmaray"))
			if(selected.trim().equals("selected"))Marmaray=true;
			if( value.equals("Metro"))
			if(selected.trim().equals("selected"))Metro=true;
			if( value.equals("Metrobus"))
			if(selected.trim().equals("selected"))Metrobus=true;
			if( value.equals("Minibus"))
			if(selected.trim().equals("selected"))Minibus=true;
			if( value.equals("Otobus_Duragi"))
			if(selected.trim().equals("selected"))Otobus_Duragi=true;
			if( value.equals("Sahil"))
			if(selected.trim().equals("selected"))Sahil=true;
			if( value.equals("TEM"))
			if(selected.trim().equals("selected"))TEM=true;
			if( value.equals("Teleferik"))
			if(selected.trim().equals("selected"))Teleferik=true;
			if( value.equals("Tramvay"))
			if(selected.trim().equals("selected"))Tramvay=true;
			if( value.equals("Tren_Istasyonu"))
			if(selected.trim().equals("selected"))Tren_Istasyonu=true;
			if( value.equals("Iskele"))
			if(selected.trim().equals("selected"))Iskele=true;
			if( value.equals("Bogaz"))
			if(selected.trim().equals("selected"))Bogaz=true;
			if( value.equals("Deniz"))
			if(selected.trim().equals("selected"))Deniz=true;
			if( value.equals("Doga"))
			if(selected.trim().equals("selected"))Doga=true;
			if( value.equals("Gol"))
			if(selected.trim().equals("selected"))Gol=true;
			if( value.equals("Havuz"))
			if(selected.trim().equals("selected"))Havuz=true;
			if( value.equals("Sehir"))
			if(selected.trim().equals("selected"))Sehir=true;
			if( value.equals("AraKat"))
			if(selected.trim().equals("selected"))Ara_Kat=true;
			if( value.equals("Ara_Kat_Dubleks"))
			if(selected.trim().equals("selected"))Ara_Kat_Dubleks=true;
			if( value.equals("Bahce_Dubleksi"))
			if(selected.trim().equals("selected"))Bahce_Dubleksi=true;
			if( value.equals("Bahce_Kati"))
			if(selected.trim().equals("selected"))Bahce_Kati=true;
			if( value.equals("Bahceli"))
			if(selected.trim().equals("selected"))Bahceli=true;
			if( value.equals("Kat_Dubleksi"))
			if(selected.trim().equals("selected"))Kat_Dubleksi=true;
			if( value.equals("Mustakil_Girisli"))
			if(selected.trim().equals("selected"))Mustakil_Girisli=true;
			if( value.equals("Ters_Dubleks"))
			if(selected.trim().equals("selected"))Ters_Dubleks=true;
			if( value.equals("Tripleks"))
			if(selected.trim().equals("selected"))Tripleks=true;
			if( value.equals("Cati_Dubleksi"))
			if(selected.trim().equals("selected"))Cati_Dubleksi=true;

	}
	public String getLink() {
		return link;
	}
	public void setLink(String link) {
		this.link = link;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getUcret() {
		return ucret;
	}
	public void setUcret(int ucret) {
		this.ucret = ucret;
	}
	public String getIl() {
		return Il;
	}
	public void setIl(String il) {
		Il = il;
	}
	public String getIlce() {
		return Ilce;
	}
	public void setIlce(String ilce) {
		Ilce = ilce;
	}
	public String getMahalle() {
		return Mahalle;
	}
	public void setMahalle(String mahalle) {
		Mahalle = mahalle;
	}
	public double getSure() {
		return sure;
	}
	public void setSure(double sure) {
		this.sure = sure;
	}
	public double getUzaklik() {
		return uzaklik;
	}
	public void setUzaklik(double uzaklik) {
		this.uzaklik = uzaklik;
	}
	
	public void puanHesapla()
	{
		puan=135-ucret/10;
		if(this.Balkon)
			puan+=10;
//		if(Havuz)
//			puan+=20;
		puan=puan-uzaklik*2;
		puan=puan-sure;
		if(Bulasik_Makinesi)
			puan+=5;
		if(Camasir_Makinesi)
			puan+=5;
		if(Buzdolabi)
			puan+=5;
		if(Set_Ustu_Ocak)
			puan+=5;
		if(Tenis_Kortu)
			puan+=5;
		if(Yuzme_Havuzu_Acik)
			puan+=20;
		if(Yuzme_Havuzu_Kapali)
			puan+=20;
		if(Otopark)
			puan+=10;
		if(Ara_Kat)
			puan+=10;
		if(Deniz)
			puan+=10;
		if(Metro)
			puan+=20;
		if(Spor_Salonu)
			puan+=20;
	}
	
	
	public void printScore()
	{
		try {
			String write=link+"\t"+Il+"\t"+Ilce+"\t"+Mahalle+"\t"+ucret+"\t"+Balkon+"\t"+uzaklik+"\t"+sure+"\t"+Bulasik_Makinesi+"\t"+Camasir_Makinesi+"\t"+Buzdolabi+"\t"+Set_Ustu_Ocak+"\t"+Tenis_Kortu+"\t"+Yuzme_Havuzu_Acik+"\t"+Yuzme_Havuzu_Kapali+"\t"+Otopark+"\t"+Ara_Kat+"\t"+Deniz+"\t"+Metro+"\t"+Spor_Salonu+
					"\t"+puan+"\r\n";
		    Files.write(Paths.get("C:\\evler\\deneme3.txt"), write.getBytes(), StandardOpenOption.APPEND);
		}catch (IOException e) {
		    e.printStackTrace();
		}
	}
	public double getPuan() {
		return puan;
	}
	public void setPuan(double puan) {
		this.puan = puan;
	}
	


	
}
