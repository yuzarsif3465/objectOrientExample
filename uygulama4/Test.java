package uygulama4;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        Ogrenci ogrenci1= new Ogrenci("yusuf","zorlu","25410",null);//dersler kısmını null yaptık cunku bosken ders ekleme yapcaz

        ArrayList<String> dersEkle= new ArrayList<>();
        dersEkle.add("turkce");
        dersEkle.add("fizik");
        ogrenci1.setDersler(dersEkle);// burda set diyerek ders bolumune eklenen dersleri gonderiyoruz
        for(String ders: dersEkle){// bu sekikde bos olan ders kısmına ekleme yaptık
            System.out.println(ders);
        }

        Ogrenci ogrenci2= new Ogrenci("ferhat","karkur","1541541",null);

        ArrayList<Ogrenci> ogrenciler= new ArrayList<>();
        ogrenciler.add(ogrenci1);
        ogrenciler.add(ogrenci2);

        for(Ogrenci ogrenci: ogrenciler){
            System.out.println(ogrenci);
        }

    }

}
