package methods.matematik;

import java.util.Scanner;

public class AtikYilMi {
    public static void main(String[] args) {
        atikYilMi();
    }

    public static void atikYilMi(){

        Scanner input=new Scanner(System.in);
        System.out.println("sorgulamak istediginiz yili giriniz");
        int yil=input.nextInt();
        String result= yil%100==0? (yil%400==0 ? "Leap Year": "Not Leap Year"): (yil%4==0 ? "Leap Year": "Not Leap Year");
        System.out.println(result);
    }
}
