package Strings;
import java.util.*;
public class RemoveWhiteSpace {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the String: ");
        String str = s.nextLine();
        s.close();
        str = str.replaceAll("\\s", ""); 
        System.out.println(str);
    }
}