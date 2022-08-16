import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {

        System.out.println(isPalindrome(404));

    }

    static boolean isPalindrome(int num){
        String s1 = String.valueOf(num);
        String s2 = String.valueOf(num);
        StringBuilder s2R = new StringBuilder(s2);
        s2R.reverse();


        return s1.equals(s2R);
    }
}
