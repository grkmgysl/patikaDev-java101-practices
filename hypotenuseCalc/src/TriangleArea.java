import java.util.Scanner;

public class TriangleArea {
    public static void main(String[] args) {
        //scanner
        Scanner scan = new Scanner(System.in);
        double side1, side2, side3, area, u;

        //get inputs
        System.out.println("Kenar 1 degeri: ");
        side1 = scan.nextDouble();

        System.out.println("Kenar 2 degeri: ");
        side2 = scan.nextDouble();

        System.out.println("Kenar 3 degeri: ");
        side3 = scan.nextDouble();

        u = (side1 + side2 + side3) / 2;
        area = Math.sqrt(u * (u - side1) * (u - side2) * (u - side3));

        System.out.println("Alanı = " + area);
    }
}
