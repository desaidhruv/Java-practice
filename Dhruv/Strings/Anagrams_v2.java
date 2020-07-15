// The complexity of this code is O(n log n)
package Strings;
import java.util.*;
public class Anagrams_v2 {
    public static String sortString(String str) {
        char[] c = str.toCharArray();
        Arrays.sort(c);
        return new String(c);
    }
    public static void isAnagram(String output1, String output2){
        if(output1.equals(output2)){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String s1 = sc.next();
        sc.close();
        String output1 = sortString(s);
        String output2 = sortString(s1);

        isAnagram(output1,output2);
    }
}