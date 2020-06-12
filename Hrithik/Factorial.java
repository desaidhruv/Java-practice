import java.util.*;

public class Factorial {
    public static void main(String[] args) {
        int fact=1 , i, n;
        System.out.println("Enter a number");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        sc.close();
        for (i = 1; i <= n; i++){
            fact = fact * i;
        }
        System.out.println("Factorial of number is " + fact);
    }
}