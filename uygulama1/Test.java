package uygulama1;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {


        ArrayList<String> dersler = new ArrayList<>();
        dersler.add("türkçe");
        dersler.add("sosyal");

        ArrayList<String> dersler2 = new ArrayList<>();
        dersler2.add("matematik");
        dersler2.add("fizik");

        Ogrenci ogrenci1 = new Ogrenci("yusuf","zorlu","20120205018",dersler);
        Ogrenci ogrenci2 = new Ogrenci( );
        ogrenci2.setAdı("ferhat");
        ogrenci2.setSoyadı("karkur");
        ogrenci2.setOkulNumarası("1357902468");
        ogrenci2.setDersler(dersler2);

        System.out.println(ogrenci1);

    }


}
