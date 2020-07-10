import java.util.*;
public class Palindrome {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter your String to check if it is a Palindrome or not:");
        String str = s.next();
        String reverse = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reverse = reverse + str.charAt(i);
        }
        if (str.equals(reverse)) {
            System.out.println("The string " + str + " is Palindrome.");
        }
        else{
            System.out.println("The string " + str + " is not Palindrome.");
        }
        s.close();
    }
}