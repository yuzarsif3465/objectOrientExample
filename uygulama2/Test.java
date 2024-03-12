package uygulama2;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {


        ArrayList<String> dersler = new ArrayList<>();
        dersler.add("türkçe");
        dersler.add("sosyal");


        Ogrenci ogrenci1 = new Ogrenci("yusuf", "zorlu", "20120205018", dersler);
        // main kısmında metot kullanmayı gösterir
        bilgilerigonder("ferhat");
        bilgileriAl(ogrenci1);
        // başka ogrenci içinde yapabilirsin---> bilgileriAl(ogrenci2);
        derslerial(ogrenci1);
    }
    public static void bilgilerigonder(String isim){
        System.out.println(isim);
    }
    public static void bilgileriAl(Ogrenci ogrenci) {
        System.out.println("adı: "+ogrenci.getAdı());
        System.out.println("adı: "+ogrenci.getSoyadı());
        // bazı özellikler istersen ekleme
        System.out.println("adı: "+ogrenci.getOkulNumarası());
        System.out.println("adı: "+ogrenci.getDersler());

    }
    public static void derslerial(Ogrenci ogrenci){
        ArrayList<String > d= ogrenci.getDersler();
        for(String ders: d){
            System.out.println(ders);
        }
    }
}
