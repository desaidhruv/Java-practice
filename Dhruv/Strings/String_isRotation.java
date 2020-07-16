package Strings;
import java.util.*;
public class String_isRotation {
    public static void checkRotation(String s, String s1){
        String temp = s1.concat(s1);
        if(s.length() == s1.length() && temp.indexOf(s1) != -1){
            System.out.println("Strings are rotation of each other.");
        }
        else{
            System.out.println("Strings are not rotation of each other.");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String s1 = sc.next();
        sc.close();
        checkRotation(s,s1);
    }
}