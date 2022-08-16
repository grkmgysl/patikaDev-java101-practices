import java.util.Scanner;

public class EbobEkok {
    public static void main(String[] args) {

        int n1, n2, ebob = 0, ekok = 0;
        boolean find = false;
        //scanner
        Scanner scan = new Scanner(System.in);

        //get inputs
        System.out.println("1. Sayiyi girin : ");
        n1 = scan.nextInt();

        System.out.println("2. Sayiyi girin : ");
        n2 = scan.nextInt();

        int tempNum = n1 - 1;

        while (!find){
            if(n1 % tempNum == 0 && n2 % tempNum == 0){
                ebob = tempNum;
                find = true;
            }
            tempNum--;
        }
        ekok = (n1 * n2) / ebob;
        System.out.println("EBOB : " + ebob);
        System.out.println("EKOK : " + ekok);

    }
}
