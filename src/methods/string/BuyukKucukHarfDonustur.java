package methods.string;

import java.util.Scanner;

public class BuyukKucukHarfDonustur {

    public static void main(String[] args) {


        buyukHarfeDonustur();
        kucukHarfeDonustur();

    }

    public static void buyukHarfeDonustur(){

        Scanner sc=new Scanner(System.in);
        System.out.println("lutfen buyuk harfe donusturmek istediginiz harfi giriniz");
        boolean sart=false;
        do{
            char harf=sc.next().charAt(0);

            if (harf>='a' && harf<= 'z') {
                harf = (char) (harf - 32);
                sart=true;
            }else {
                System.out.println("yanlis giris oldu. tekrar deneyin.");
            }
            System.out.println(harf);
        }while (sart==false);
    }
    public static void kucukHarfeDonustur(){

        Scanner sc=new Scanner(System.in);
        System.out.println("lutfen kucuk harfe donusturmek istediginiz harfi  giriniz");
        boolean sart=false;
        do{
            char harf=sc.next().charAt(0);

            if (harf>='A' && harf<= 'Z') {
                harf = (char) (harf + 32);
                sart=true;
            }else {
                System.out.println("yanlis giris oldu. tekrar deneyin.");
            }
            System.out.println(harf);
        }while (sart==false);
    }
}
