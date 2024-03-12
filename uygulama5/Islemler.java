package uygulama5;

import java.util.ArrayList;

public class Islemler {
    // static bir liste olusturucaz bu clastaki her metot icin sabit ozellikler olacak
    private static ArrayList<Ogrenci> ogrenciler= new ArrayList<>();
    // private oldugu icin diger classlara ulasmak ıcın get-set motodu almak gerekiyor
    // bu kısımda bos bir liste olusturduk set metoduyla yeni liste almaya gerek yok
    //public static void setOgrenciler(ArrayList<Ogrenci> ogenciler){Islemler.ogrenciler=ogrenciler;}
    //ogrenci listesini almak için get metodunu kullanıyoruz
    public ArrayList<Ogrenci> getOgrenciler(){
        return ogrenciler;
    }

    public void ogrenciEkle(Ogrenci ogrenci){
         boolean durum= ogrenciler.add(ogrenci);
         if(durum){
             System.out.println(ogrenci.getAdı()+"adlı ogrenci basarılı bir sekilde eklendi");
         }
         else{
             System.out.println("ogrenci eklenirken bir hata oluştu");
         }
    }


}
