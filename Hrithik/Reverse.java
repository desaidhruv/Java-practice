import java.util.*;

public class Reverse {
    public static void main(String[] args) {
        int n, rev=0, digit;
        System.out.println("Enter number");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        sc.close();
        while(n!=0){
            digit = n%10;
            rev = rev*10 + digit;
            n = n/10;
        }
        System.out.println("Reverse of a number:"+ rev);
    }
}