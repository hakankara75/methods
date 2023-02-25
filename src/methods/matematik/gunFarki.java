package methods.matematik;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.LocalTime;
import java.util.Date;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class gunFarki {
    public static void main(String[] args) throws ParseException {
        gunFarkiBul();
        saatFarkiBul();
        saniyeFarkiBul();
    }


    public static long gunFarkiBul() throws ParseException {
        //   Iki farkli tarih icin gun farkini bulunuz.
        Date date=null;
        Date date1=null;
        Scanner scanner=new Scanner(System.in);
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println("Tarihi su sekilde girin (gg/aa/yy):");
        String giris = scanner.nextLine();
        if(null != giris && giris.trim().length() > 0){
            date = format.parse(giris);
        }
        System.out.println("ikinci tarihi su sekilde girin (gg/aa/yy):");
        String giris1 = scanner.nextLine();
        if(null != giris1 && giris1.trim().length() > 0){
            date1 = format.parse(giris1);
        }
        long fark = date.getTime() - date1.getTime();
        long gun=TimeUnit.DAYS.convert(Duration.ofDays(TimeUnit.DAYS.convert(fark, TimeUnit.MILLISECONDS)));
        System.out.println(gun); // 19
        return gun;
    }
    public static Duration saatFarkiBul(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("ilk tarihi su sekilde girin (gg/aa/yy) : ");
        LocalTime time1 = LocalTime.ofSecondOfDay(scanner.nextInt());
        System.out.println("ikinci tarihi su sekilde girin (gg/aa/yy) : ");
        LocalTime time2 = LocalTime.ofSecondOfDay(scanner.nextInt());
              Duration between1 = Duration.between(time2, time1);
        System.out.println("iki tarih arasindaki saat farki:" +between1.toHours());
        return between1;
    }
    public static Duration saniyeFarkiBul(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("ilk tarihi su sekilde girin (gg/aa/yy) : ");
        LocalTime time1 = LocalTime.ofSecondOfDay(scanner.nextInt());
        System.out.println("ikinci tarihi su sekilde girin (gg/aa/yy) : ");
        LocalTime time2 = LocalTime.ofSecondOfDay(scanner.nextInt());
        Duration between1 = Duration.between(time2, time1);
        System.out.println(between1.getSeconds()); //
        return between1;
    }
}
