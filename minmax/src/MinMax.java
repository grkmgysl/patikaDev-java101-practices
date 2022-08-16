import java.util.Scanner;

public class MinMax {
    public static void main(String[] args) {

        int n, max = 0, min = 0, temp;

        //scanner
        Scanner scan = new Scanner(System.in);

        //get inputs
        System.out.println("Kaç tane sayı gireceksiniz : ");
        n = scan.nextInt();

        for (int i = 1; i <= n; i++){
            System.out.println(i + ". Sayiyi girin: ");
            temp = scan.nextInt();
            if(temp > max){
                max = temp;
            }
            if(temp < min){
                min = temp;
            }
        }

        System.out.println("En büyük sayi: "+ max);
        System.out.println("En kücük sayi: "+ min);
    }
}
