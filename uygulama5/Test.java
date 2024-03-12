package uygulama5;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        Ogrenci ogrenci1 = new Ogrenci("yusuf", "zorlu", "25410", null);//dersler kısmını null yaptık cunku bosken ders ekleme yapcaz

        ArrayList<String> dersEkle = new ArrayList<>();
        dersEkle.add("turkce");
        dersEkle.add("fizik");
        ogrenci1.setDersler(dersEkle);

        Ogrenci ogrenci2 = new Ogrenci("ferhat", "karkur", "1541541", null);

        Islemler oIlemleri= new Islemler();
        oIlemleri.ogrenciEkle(ogrenci1);


    }
}
