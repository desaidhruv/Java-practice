
import java.util.*;

public class MisingInteger {
    public static void Missing(int[] arr, int n){
        int total = n*(n+1)/2;
        for(int i = 0; i < n; i++){
            total -= arr[i];
        }
        System.out.println(total);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i= 0 ; i < n-1; i++){
            a[i] = sc.nextInt();
        }
        Missing(a, n);
        sc.close();
    }
}