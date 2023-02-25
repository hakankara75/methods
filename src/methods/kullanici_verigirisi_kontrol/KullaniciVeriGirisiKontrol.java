package methods.kullanici_verigirisi_kontrol;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/* BU METOT NE ISE YARAR:
bu metot, kullanicidan int veri girisi istenilen yerlerde kullanicinin string veya negatif sayi girisini engelleyip
yalnizca pozitif sayilari kabul eden ve hatasiz veri girisi saglar. kullanacaginiz variable yerine "veriGirisi()"
yazmaniz yeterli. Örneğin, kullaci yas girecek, bunun yerine negatif veya string girmeye kalkarsa bu metot ile giremez.
 */
public class KullaniciVeriGirisiKontrol {
         private String girilen;
        private int veri;

        public String getGirilen() {
            return girilen;
        }

        public int getVeri() {
            return veri;
        }

        public void setGirilen(String girilen) {
            this.girilen = girilen;
        }

        public void setVeri(int veri) {
            this.veri = veri;
        }

        public KullaniciVeriGirisiKontrol(String girilen, int veri) {
            this.girilen = girilen;
            this.veri = veri;
        }

        @Override
        public String toString() {
            return "Deneme{" +
                    "girilen='" + girilen + '\'' +
                    ", veri=" + veri +
                    '}';
        }

        static KullaniciVeriGirisiKontrol veriGirisi=new KullaniciVeriGirisiKontrol("fizik", 88);

        public static int veriGirisi(){
            boolean c=false;
            Integer menuSec=0;
            do{

                BufferedReader brr = new BufferedReader(new InputStreamReader(System.in));
                try {
                    veriGirisi.setVeri(Integer.parseInt(brr.readLine()));
                    c = true;
                }catch (NumberFormatException e){
                    System.out.println("Yanlis karakter girdiniz");
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
                menuSec= veriGirisi.getVeri();
            }while (!c);
            return menuSec;
        }
    }

