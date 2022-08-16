import java.util.Scanner;

public class PerceftNumber {
    public static void main(String[] args) {

        int n, temp = 0;

        //scanner
        Scanner scan = new Scanner(System.in);

        //get inputs
        System.out.println("Sayi girin: ");
        n = scan.nextInt();

        for (int i = 1; i < n; i++){
            if (n % i == 0){
                temp += i;
            }
        }
        if (n == temp){
            System.out.println(n + " mükemmel sayidir.");
        }else{
            System.out.println(n + " mükemmel sayi degildir.");
        }
    }
}
