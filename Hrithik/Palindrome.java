import java.util.*;

public class Palindrome {
    public static void main(String[] args) {
        int n, rev=0,digit,temp;
        System.out.println("Enter a number to check palindrome or not");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        sc.close();
        temp = n;
        while(n!=0){
            digit = n % 10;
            rev = rev * 10 + digit;
            n = n / 10;
        }
        System.out.println("Reverse of the number is " + rev);
        if(temp == rev){
            System.out.println("The entered number is palindrome");
        } else {
            System.out.println("The entered number is not palindrome");
        }
    }
}