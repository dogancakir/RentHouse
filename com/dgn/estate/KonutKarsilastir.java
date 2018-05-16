package com.dgn.estate;

import java.util.Comparator;

public class KonutKarsilastir implements Comparator<KonutOzellikler> {

    @Override
    public int compare(KonutOzellikler o1, KonutOzellikler o2) {
       Integer oo1=(int)o1.getPuan();
       Integer oo2=(int)o2.getPuan();
        return oo1.compareTo(oo2);
    }

}
