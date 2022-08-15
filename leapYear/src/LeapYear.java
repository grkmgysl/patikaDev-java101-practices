import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {

        int year;

        //scanner
        Scanner scan = new Scanner(System.in);

        //get inputs
        System.out.println("Yili girin : ");
        year = scan.nextInt();

        if(year % 100 == 0){
            if(year % 400 == 0){
                System.out.println(year + " bir artik yildir");
            }else {
                System.out.println(year + " bir artik yil değildir");
            }
        } else if (year % 4 == 0) {
            System.out.println(year + " bir artik yildir");
        } else {
            System.out.println(year + " bir artik yil degildir");
        }
    }
}
