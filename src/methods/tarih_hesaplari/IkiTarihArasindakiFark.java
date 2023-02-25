package methods.tarih_hesaplari;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class IkiTarihArasindakiFark {

    static void IkiTarihinFarkiniBul(){


    Scanner inp=new Scanner(System.in);
    System.out.println("Lutfen yili girin");
    int a= inp.nextInt();
    System.out.println("Lutfen ayi girin");
    int b= inp.nextInt();
    System.out.println("Lutfen gunu girin");
    int c= inp.nextInt();
    LocalDate i= LocalDate.of( a,  b,  c);

        System.out.println("Lutfen 2. yili girin");
        int d= inp.nextInt();
        System.out.println("Lutfen 2. ayi girin");
        int e= inp.nextInt();
        System.out.println("Lutfen 2. gunu girin");
        int f= inp.nextInt();
        LocalDate k= LocalDate.of( d,  e,  f);

    Period diff = Period.between(i, k);

    System.out.print( "Iki tarih arasindaki fark: ");

    System.out.printf(
            "%d yıl, %d ay"
                    + " ve %d gün ",
            diff.getYears(),
            diff.getMonths(),
            diff.getDays());
}


    public static void main(String[] args) {


        IkiTarihinFarkiniBul();
    }

}
