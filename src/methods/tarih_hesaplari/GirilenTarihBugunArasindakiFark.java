package methods.tarih_hesaplari;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class GirilenTarihBugunArasindakiFark {


     static void girilenTarihIleBugunArasindakiFark(){


         Scanner inp=new Scanner(System.in);
         System.out.println("Lutfen yili girin");
         int a= inp.nextInt();
         System.out.println("Lutfen ayi girin");
         int b= inp.nextInt();
         System.out.println("Lutfen gunu girin");
         int c= inp.nextInt();
         LocalDate i= LocalDate.of( a,  b,  c);

         LocalDate k= LocalDate.now();
         Period diff = Period.between(i, LocalDate.now());

         System.out.print( "Verilen tarihten bugunku tarihe kadarki fark: ");

         System.out.printf(
                 "%d yıl, %d ay"
                         + " ve %d gün ",
                 diff.getYears(),
                 diff.getMonths(),
                 diff.getDays());
     }


     public static void main(String[] args) {


         girilenTarihIleBugunArasindakiFark();
 }

}
