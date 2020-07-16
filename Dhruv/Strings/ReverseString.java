package Strings;
import java.util.*;
public class ReverseString {
    public static void swap(char[] c,int i, int j){
        char temp = c[i];
        c[i] = c[j];
        c[j] = temp;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String: ");
        String s = sc.nextLine();
        sc.close();
        char[] c = s.toCharArray();
        int i = 0;
        int j = c.length - 1;
        while(i < j){
            swap(c, i, j);
            i++;
            j--;
        }
        String string = new String(c);
        System.out.print("The String is: "+string);

    }
}