package Strings;
import java.util.*;
public class Occurences {
    public static void findOccurence(String s){
        int[] count = new int[256];
        int len = s.length();
        for (int i = 0; i < len; i++) {
            count[s.charAt(i)]++;
        }
        char[] array = new char[len];
        for (int i = 0; i < len; i++) {
            array[i] = s.charAt(i);
            int flag = 0;
            for(int j = 0; j <= i; j++){
                if(s.charAt(i) == array[j]){
                    flag++;
                }
            }
            if(flag == 1){
                System.out.println("Occurence of char " + s.charAt(i)
                + " in the String is:" + count[s.charAt(i)]);
            }
        }
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the String: ");
        String s1 = s.nextLine();
        s.close();
        findOccurence(s1);
    }
}