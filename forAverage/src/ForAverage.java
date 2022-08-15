import java.util.Scanner;

public class ForAverage {
    public static void main(String[] args) {

        int number, sum = 0, average, totalNums = 0;

        //scanner
        Scanner scan = new Scanner(System.in);

        //get inputs
        System.out.println("Sayi giriniz : ");
        number = scan.nextInt();

        for (int i = 1; i <= number; i++ ){
            if(i % 12 == 0){
                sum += i ;
                totalNums++;
            }
        }
        average = sum / totalNums ;
        System.out.println("ortalama : " + average);
    }
}
