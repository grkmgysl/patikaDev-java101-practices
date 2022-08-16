import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {

        int n, temp1 = 0, temp2 = 1, temp3;

        //scanner
        Scanner scan = new Scanner(System.in);

        //get inputs
        System.out.println("Sayi girin: ");
        n = scan.nextInt();

        System.out.print(temp1 + " ");
        System.out.print(temp2 + " ");

        for (int i = 0; i < n-1; i++ ){
            temp3 = temp1 + temp2;
            System.out.print(temp3 + " ");
            temp1 = temp2;
            temp2 = temp3;
        }
    }
}
