package methods.string;

import java.util.Scanner;

public class Metni_Sayiya_Cevir {
    public static void main(String[] args) {

        sayiyaCevir();


    }

    public static int sayiyaCevir(){
        Scanner sc=new Scanner(System.in);
        System.out.println("lutfen bir metin giriniz");
        String metin=sc.nextLine();
        String son=metin.trim().replaceAll("\\D", "");
        int sayi=Integer.valueOf(son);
        //int sayi=Integer.parseInt(son);
        System.out.println(sayi);
return sayi;
    }
}
