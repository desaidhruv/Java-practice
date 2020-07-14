import java.util.*;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String");
        String name = sc.nextLine();
        int n = name.length();
        String b = "";

        for(int i = n-1; i >= 0; i--){
            b = b+ name.charAt(i);
        }
        if(name.equalsIgnoreCase(b)){
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
        sc.close();
    }
}