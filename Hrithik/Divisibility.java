import java.util.*;

public class Divisibility {
    public static void main(String[] args) {
        int n;
        System.out.println("Enter number to check for divisibility");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        if (n%3==0 || n%5==0){
            System.out.println(n + " is divisible by 3 or 5");
        } else {
            System.out.println(n + " is not divisible by 3 or 5");
        }
    }
}