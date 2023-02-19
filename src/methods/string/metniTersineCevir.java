package methods;

import java.util.Scanner;

public class metniTersineCevir {
    static String sonuc="";
    public static void metniTersineCevir() {
        Scanner scan=new Scanner(System.in);
        System.out.println("yazi girin");
        String girilen=scan.nextLine();
        String []girilen1= girilen.trim().split("");
        for (int i = girilen1.length-1; i >-1 ; i--) {
            sonuc+=girilen1[i];
        }
        System.out.println(sonuc);
    }
}
