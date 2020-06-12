import java.util.*;

public class Prime {
    public static void main(String[] args) {
        int n, i=2;
        System.out.println("Enter a number to check prime or not");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        while( n%i != 0 ){
            i++;
        } if (n == i){
            System.out.println(n + " is Prime number");
        } else {
            System.out.println(n + " is not Prime number");
        }
    }
}