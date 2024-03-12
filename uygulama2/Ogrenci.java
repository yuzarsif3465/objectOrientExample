package uygulama2;

import java.util.ArrayList;

    public class Ogrenci {
        private static String okulu;
        private String adı;
        private String soyadı;
        private String okulNumarası;
        private ArrayList<String> dersler;

    /*public Ogrenci(String okulu, String adı....){
        this.adı= adı;
        //bunu uzun uzun yazmak yerine alt+ shift+s e bas constructoru ordan hazır al...(bu ıde de kabul etmiyor)

    }*/

        public Ogrenci(String adı, String soyadı, String okulNumarası, ArrayList<String> dersler){
            this.adı=adı;
            this.soyadı=soyadı;
            this.okulNumarası=okulNumarası;
            this.dersler=dersler;
        }

        /*public Ogrenci() {
            // bu boş constructor ogrenci2 de set kullandıgımız icin (olmasa da olur)
        }*/


        // source da alt+shşft+s gibi ama bulamıyorum (to string, get set metotlarına kısa yoldan ulaşabilirsin)

        public String getOkulu() {
            return okulu;
        }
        public void setOkulu(String okulu){
            Ogrenci.okulu=okulu;
        }
        public String getAdı() {
            return adı;
        }
        public void setAdı(String adı){
            this.adı=adı;
        }
        public String getSoyadı() {
            return soyadı;
        }
        public void setSoyadı(String soyadı){
            this.soyadı=soyadı;
        }
        public String getOkulNumarası() {
            return okulu;
        }
        public void setOkulNumarası(String okulNumarası){
            this.okulNumarası=okulNumarası;
        }
        public ArrayList<String> getDersler(){
            return dersler;
        }
        public void setDersler(ArrayList<String> dersler){
            this.dersler=dersler;
        }


        public String toString() {
            return "Ogrenci{" +
                    "adı='" + adı + '\'' +
                    ", soyadı='" + soyadı + '\'' +
                    ", okulNumarası='" + okulNumarası + '\'' +
                    ", dersler=" + dersler +
                    '}';
        }
    }

