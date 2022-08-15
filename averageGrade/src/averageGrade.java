import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class averageGrade {
    public static void main(String[] args) {
        //variables
        int mat, fizik, kimya, turkce, tarih, muzik;

        //scanner
        Scanner scan = new Scanner(System.in);

        //get inputs
        System.out.println("Matematik notu: ");
        mat = scan.nextInt();

        System.out.println("Fizik notu: ");
        fizik = scan.nextInt();

        System.out.println("Kimya notu: ");
        kimya = scan.nextInt();

        System.out.println("Turkce notu: ");
        turkce = scan.nextInt();

        System.out.println("Tarih notu: ");
        tarih = scan.nextInt();

        System.out.println("Muzik notu: ");
        muzik = scan.nextInt();

        //average calculation
        int sum = mat + fizik + kimya + turkce + tarih + muzik;
        double average = sum / 6.0;

        System.out.println("Ortalamaniz" + average);

        String isPassed = average > 60 ? "geçti" : "kaldi";
        System.out.println(isPassed);

    }
}
