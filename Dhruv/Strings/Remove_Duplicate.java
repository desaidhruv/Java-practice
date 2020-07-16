package Strings;
import java.util.*;
public class Remove_Duplicate {
    public static void removeDuplicate(String s){
        char[] c = s.toCharArray();
        Arrays.sort(c);
        for (int i = 0; i < s.length(); i++) {
            int j = 0;
            for ( j = i+1; j < s.length(); j++) {
                if(c[i] == c[j]){
                    break;
                }
                else if(c[i] != c[j]){
                    System.out.print(c[j]+ " ");
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        sc.close();
        removeDuplicate(s);
    }
}