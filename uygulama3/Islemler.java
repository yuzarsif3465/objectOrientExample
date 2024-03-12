package uygulama3;

import java.util.ArrayList;

//bir nesneyi metotlar aracılılgıyla taşıyoruz
public class Islemler {
    public void ogrenciBilgileri(Ogrenci o) {
        System.out.println(o.getAdı());
    }

    public void dersArama(Ogrenci o, String ders) {//buradaki ders aranan ders
        ArrayList<String> dersler= o.getDersler();// bu metot icinde bir liste actık ve varolan dersleri karsılastırmak icin buraya gonderdik
        boolean durum=true;
        for(String d:dersler){
            if(d.equals(ders)){// d esit mi ders e
                System.out.println("aradıgınız dersi bu ogrenci alıyor");
                durum= false;
                break;
            }
        }
        if(durum){
            System.out.println("aradıgınız ogrenci bu dersi almıyor");
        }
    }
}