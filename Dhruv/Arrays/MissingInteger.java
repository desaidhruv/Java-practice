package Arrays;
import java.util.*;
public class MissingInteger {
    public static void findNumber(int[] arr, int n){
        int total = n*(n+1)/2;
        for (int i = 0; i < n; i++) {
            total = total - arr[i];
        }
        System.out.println(total);
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the size of an array:");
        int n = s.nextInt();
        System.out.println("Enter the array elements:");
        int[] arr = new int[n];
        for (int i = 0; i < n-1; i++) {
            arr[i] = s.nextInt();
        }
        s.close();
        findNumber(arr,n);
    }
}