import java.util.Scanner;

public class Harmonic {
    public static void main(String[] args) {

        int num;
        double result = 0;


        //scanner
        Scanner scan = new Scanner(System.in);

        //get inputs
        System.out.println("Sayi girin : ");
        num = scan.nextInt();

        for (int i = 1; i <= num; i++){
            result += (1.0 / i);
        }
        System.out.println("N'ye kadar olan harmonic : " + result);
    }
}
