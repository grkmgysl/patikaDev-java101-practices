import java.util.Scanner;

public class CircleArea {
    public static void main(String[] args) {

        int radius ;
        double pi = 3.14, area, circumference;

        //scanner
        Scanner scan = new Scanner(System.in);

        //get inputs
        System.out.println("Yarıçap girin: ");
        radius = scan.nextInt();

        circumference = 2 * pi * radius ;
        area = pi * radius * radius;

        System.out.println("alan = " + area);
        System.out.println("çevre = " + circumference);
    }
}
