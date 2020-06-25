import java.util.*;

public class StringPalindrome {
    public static void main(String[] args) {
        String str,b = "";
        Scanner sc=new Scanner(System.in);
        str=sc.nextLine();
        int n = str.length();
        sc.close();
        for(int i = n - 1; i >= 0; i--)
        {
            b = b + str.charAt(i);
        }
        if(str.equalsIgnoreCase(b)){
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}