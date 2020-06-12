import java.util.*;

public class Armstrong {
    public static void main(String[] args) {
        int n, digit, sum = 0, temp;
        System.out.println("Enter a number to check Armstrong or not?");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        sc.close();
        temp = n;
        while (n!=0) {
            digit = n % 10;
            sum = (digit * digit * digit) + sum;
            n = n /10;
        }
        if (sum == temp) {
            System.out.println(sum + " is a Armstrong number");
        } else {
            System.out.println(sum + " is not a Armstrong number");
        }
    }
}