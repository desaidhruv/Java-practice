import java.util.*;

public class Anagrams {
    public static void CheckAnagram(String str1, String str2){
        int l1 = str1.length();
        int l2 = str2.length();
        boolean status = true;

        if(l1 != l2){
            status = false;
        } else {
            char[] x = str1.toLowerCase().toCharArray();
            char[] y = str2.toLowerCase().toCharArray();

            Arrays.sort(x);
            Arrays.sort(y);

            status = Arrays.equals(x, y);

            if(status){
                System.out.println("Both are anagrams");
            } else {
                System.out.println("Not anagrams");
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String b = sc.nextLine();
        CheckAnagram(a, b);
        sc.close();
    }
}