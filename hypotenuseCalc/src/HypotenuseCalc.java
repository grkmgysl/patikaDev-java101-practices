import java.util.Scanner;

public class HypotenuseCalc {
    public static void main(String[] args) {

        //scanner
        Scanner scan = new Scanner(System.in);
        double side1, side2, side3;

        //get inputs
        System.out.println("Kenar 1 degeri: ");
        side1 = scan.nextDouble();

        System.out.println("Kenar 2 degeri: ");
        side2 = scan.nextDouble();

        side3 = Math.sqrt(side1*side1 + side2*side2);

        System.out.println("Hipotenus = " + side3);
    }
}
