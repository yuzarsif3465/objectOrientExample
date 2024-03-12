package uygulama3;

import java.util.ArrayList;
// bu uygulamada output metotları için yeni bir class oluşturucaz
public class Test {
    public static void main(String[] args) {


        ArrayList<String> dersler = new ArrayList<>();
        dersler.add("türkçe");
        dersler.add("sosyal");


        Ogrenci ogrenci1 = new Ogrenci("yusuf", "zorlu", "20120205018", dersler);

        Islemler oBilgileri = new Islemler();//ıslemler classı ıcın yeni nesne oluşturduk
        oBilgileri.ogrenciBilgileri(ogrenci1);// nesne icindeki metoda burdan ulastık

        Islemler dArama= new Islemler();
        dArama.dersArama(ogrenci1,"sosyal");

    }



}
