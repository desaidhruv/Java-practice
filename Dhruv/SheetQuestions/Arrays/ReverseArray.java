package SheetQuestions.Arrays;
import java.util.*;
public class ReverseArray {
    public static void main(String[] args) {
        String initial,rev = "";
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string you want to reverse: ");
        initial = sc.next();
        for(int i = initial.length() - 1; i >= 0; i--) {
            rev += initial.charAt(i);
        }
        sc.close();
        System.out.print("The Reverse String is: "+rev);
    }
}
