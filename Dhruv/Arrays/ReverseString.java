package Arrays;
import java.util.*;
public class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String initial, rev = "";
        System.out.println("Enter the String you want to reverse: ");
        initial = sc.next();
        for(int i = initial.length() - 1; i >= 0; i--) {
            rev += initial.charAt(i);
        }
        System.out.println("The reverse is: "+rev);
        sc.close();
    }
}
