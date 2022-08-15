import java.util.Scanner;

public class KDVPrice {
    public static void main(String[] args) {
        int  inPrice  ;
        double kdv, kdvPrice, totalPrice;
        //scanner added
        Scanner scan = new Scanner(System.in);

        System.out.println("Ürün fiyati: ");
        inPrice = scan.nextInt();

        kdv = inPrice > 1000 ? 0.08 : 0.18 ;
        kdvPrice = inPrice * kdv;
        totalPrice = inPrice + kdvPrice;

        System.out.println("KDV'siz Fiyat = " + inPrice);
        System.out.println("KDV'li Fiyat = " + totalPrice);
        System.out.println("KDV tutarı = " + kdvPrice);


    }
}
