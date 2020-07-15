package Strings;
import java.util.*;
public class Duplicate {
    public static void findDuplicate(String s){
        char[] x = s.toCharArray();
        for (int i = 0; i < s.length(); i++) {
            for (int j = i+1; j < s.length(); j++) {
                if(x[i] == x[j]){
                    System.out.print("The repeated character is: "+x[j]);
                    break;
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the String: ");
        String s1 = s.nextLine();
        s.close();
        findDuplicate(s1);
    }
}