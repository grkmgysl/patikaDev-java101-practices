import java.util.Scanner;

public class TaxiMeter {
    public static void main(String[] args) {

        double perKm = 2.2, inKm, totalPrice, checkPrice;
        int minPrice = 20 , openingPrice = 10;

        //scanner
        Scanner scan = new Scanner(System.in);

        //get inputs
        System.out.println("Kac Km gidildi: ");
        inKm = scan.nextDouble();

        checkPrice = openingPrice + inKm * perKm ;

        totalPrice = checkPrice < 20.0 ? 20.0 : checkPrice ;

        System.out.println("toplam fiyat = " + totalPrice );
    }
}
