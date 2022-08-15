import java.util.Scanner;

public class Temprature {

    public static void main(String[] args) {

        int temprature ;

        //scanner
        Scanner scan = new Scanner(System.in);

        //get inputs
        System.out.println("Sıcaklık :  ");
        temprature = scan.nextInt();

        if(temprature > 25){
            System.out.println("Yüzme");
        } else if (temprature > 15) {
            System.out.println("piknik");
        } else if (temprature > 5) {
            System.out.println("sinema");
        } else {
            System.out.println("kayak");
        }
    }
}
