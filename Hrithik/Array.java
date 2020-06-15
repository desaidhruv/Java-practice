import java.util.*;

public class Array {
    public static void main(final String[] args) {
        int n;
        long sum = 0;
        System.out.println("Enter how many numbers you want to enter");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int[] a = new int[n];
        System.out.println("Enter all elements");
        for(int i = 0; i < n; i++){
            a[i] = sc.nextInt();
            sum = sum + a[i];
        }
        System.out.println("Sum: " + sum);
        sc.close();
    }
}