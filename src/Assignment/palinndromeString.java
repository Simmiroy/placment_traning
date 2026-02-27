package Assignment;
import java.util.Scanner;
public class palinndromeString {

        static boolean isPalindrome(String str) {
            String reversed = new StringBuilder(str).reverse().toString();
            return str.equalsIgnoreCase(reversed);
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter a string: ");
            String str = sc.nextLine();

            if (isPalindrome(str))
                System.out.println("Palindrome");
            else
                System.out.println("Not a Palindrome");
        }

}
