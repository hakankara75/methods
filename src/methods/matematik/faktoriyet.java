package methods.matematik;

import java.util.Scanner;
import java.util.stream.IntStream;

public class faktoriyet {
    public static int faktoriyel(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Lutfen faktoriyelini bulmak istediginiz sayiyi girin");
        int x=sc.nextInt();
        int sonuc= IntStream.
                rangeClosed(1,x).
                reduce(1,(a,b)->a*b);    //akistan gelen elemanlari tek bir elemana donusturur
        System.out.println(sonuc);
        return sonuc;
    }
}
