import java.util.*;

/**
 * First
 */
public class SumofDigits {

    public static void main(String[] args) {
        int n, digit, sum = 0;
        System.out.println("Enter a number");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        sc.close();
        while(n!=0) {
            digit = n % 10;
            sum = sum + digit;
            n = n/ 10;
        }
        System.out.println("Sum of digits = " + sum);
        
    }
}