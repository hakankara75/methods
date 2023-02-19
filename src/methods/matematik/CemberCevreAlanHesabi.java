package methods;

import java.util.Scanner;

public class CemberCevreAlanHesabi {
    public static void main(String[] args) {

        cemberCevresiHesapla();
        daireAlaniHesapla();
    }
    public static double cemberCevresiHesapla(){
        //Soru 5) Kullanicidan yaricap isteyip
        // cemberin cevresini ve dairenin alanini hesaplayip yazdirin
        // cember = 2*pi*yaricap
        // daire : p*yaricap*yaricap

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen cemberin yaricapini giriniz");
        double yaricap= scan.nextDouble();
        double cemberCevre= 2*((Math.floor(Math.PI))*yaricap);

        System.out.println("girdiginiz yaricap : " + yaricap);
        System.out.println("cemberin cevresi : " + cemberCevre) ;
return cemberCevre;
    }
    public static double daireAlaniHesapla(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen cemberin yaricapini giriniz");
        double yaricap= scan.nextDouble();
        double daireAlan= Math.floor(Math.PI) * yaricap*yaricap;
        System.out.println("girdiginiz yaricap : " + yaricap);
        System.out.println("dairenin alani : " + daireAlan) ;
return daireAlan;
    }

}
