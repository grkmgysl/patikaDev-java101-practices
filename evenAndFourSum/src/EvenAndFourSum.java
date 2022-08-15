import java.util.Scanner;

public class EvenAndFourSum {
    public static void main(String[] args) {
        int n, sum = 0;

        //scanner
        Scanner scan = new Scanner(System.in);

        do {
            System.out.println("Sayi giriniz : ");
            n = scan.nextInt();
            if(n % 4 == 0){
                sum += n;
            }

        }while ( n % 2 != 1  );

        System.out.println("Sonuc " + sum);

    }
}
