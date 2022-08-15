import java.util.Scanner;

public class MultiplesOfFourFive {
    public static void main(String[] args) {

        int n, fourSum = 1, fiveSum = 1;

        //scanner
        Scanner scan = new Scanner(System.in);

        //get inputs
        System.out.println("Sayi girin : ");
        n = scan.nextInt();

        for(int i = 1; i <= n; i++){
            fourSum *= 4;
            System.out.println("4ün " + i + ". kuvveti : "+ fourSum );
        }
        for(int i = 1; i <= n; i++){
            fiveSum *= 5;
            System.out.println("5in " + i + ". kuvveti : "+ fiveSum );
        }

    }
}
