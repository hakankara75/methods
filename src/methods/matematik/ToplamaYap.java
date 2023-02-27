package methods.matematik;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ToplamaYap {
    public static void main(String[] args) {

        toplam();
    }

    public static int toplam(int... b) {

        Scanner inp = new Scanner(System.in);
        int sum = 0;
        System.out.println("Toplayacaginiz sayilari art arda girip toplayabilirsiniz. \n" +
                "Islemi bitirmek istediginizde '0' (sifir) tusuna basip enter yapiniz");
        boolean test = false;
        do {
            System.out.println("Lutfen sayiyi giriniz");
            int ilk=0;
            try {  ilk = inp.nextInt();
                if (ilk < 0 || ilk > 0){
                    sum += ilk;
                }
                else if (ilk == 0) {
                    test = true;
                }else toplam();
            } catch (InputMismatchException e) {
                System.out.println("Yanlis karakter girdiniz");
                test = true;
            } catch (Exception f) {
                System.out.println("Yanlis karakter girdiniz");
                test = true;
            }
        } while (!test);
        if (sum!=0)
            System.out.println("Toplam sayi: " + sum);
        return sum;
    }
}
