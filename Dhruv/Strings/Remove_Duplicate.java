package Strings;
import java.util.*;
public class Remove_Duplicate {
    public static void removeDuplicate(String s) 
    { 
        StringBuilder sb = new StringBuilder();
        Set<Character> HashSet = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            HashSet.add(s.charAt(i));
        }
        
        for (Character c : HashSet) {
            sb.append(c);
        }
        System.out.println(sb);
    } 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        sc.close();
        removeDuplicate(s); 
    }
}