package methods.matematik;

import java.util.Scanner;

public class dikdortgenPrizmaHacimHesapla {
    static double length;
    static double width;
    static double height;

    public static void main(String[] args) {
        dikdortgenPrizmaHacmiHesapla();
    }

    private static double dikdortgenPrizmaHacmiHesapla() {
        //  uzunluk, genişlik, yükseklik olan dikdörtgenler prizmasının hacmini hesaplayan bir program yazıniz

        // İpucu: dikdörtgenin hacmi= width*height*length;

        Scanner scan =new Scanner(System.in);
        System.out.println("Uzunluğu giriniz :");
        length=scan.nextDouble();
        System.out.println("Genişliği giriniz:");
        width=scan.nextDouble();
        System.out.println("Yüksekliği giriniz:");
        height=scan.nextDouble();
        System.out.println("Dikdörtgenin hacmi:"+length*width*height);
        return  length*height*width;


    }

}