import java.util.Scanner;

public class Bmi {
    public static void main(String[] args) {

        int weigth;
        double height, bmi;

        //scanner
        Scanner scan = new Scanner(System.in);

        //get inputs
        System.out.println("Lütfen boyunuzu (metre cinsinde) giriniz : ");
        height = scan.nextDouble();

        System.out.println("Lütfen kilonuzu giriniz : ");
        weigth = scan.nextInt();

        bmi = weigth / (height * height);

        System.out.println("Vücut Kitle İndeksiniz : " + bmi);
    }
}
