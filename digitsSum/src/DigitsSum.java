import java.util.Scanner;

public class DigitsSum {
    public static void main(String[] args) {

        int num, tempNum, digits = 0, result = 0;


        //scanner
        Scanner scan = new Scanner(System.in);

        //get inputs
        System.out.println("Sayi girin : ");
        num = scan.nextInt();

        tempNum = num;

        while (tempNum != 0) {
            tempNum /= 10;
            digits++;
        }

        tempNum = num;

        for (int i = 0; i < digits; i++){
            result += tempNum % 10 ; // 1643 gives 3
            //System.out.println(result);
            tempNum /= 10 ; // temp becomes 164

        }

        System.out.println("Basamaklar toplamı : " + result);
    }
}
