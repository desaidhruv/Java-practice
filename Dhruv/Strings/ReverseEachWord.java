package Strings;
import java.util.*;
public class ReverseEachWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        
        StringBuilder temp = new StringBuilder(str);
        System.out.println("After reversing:" + temp.reverse());
        sc.close();
    }
}