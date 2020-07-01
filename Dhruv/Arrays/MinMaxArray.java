package Arrays;
import java.util.*;
class MaxMin{
    public int getMin(int arr[], int n) {
        int res = arr[0];
        for (int i = 1; i < arr.length; i++) {
            res = Math.min(res, arr[i]);
        }
        System.out.println("The minimum number in the array is "+res);
        return res;
    }
    public int getMax(int arr[], int n) {
        int res = arr[0];
        for (int i = 1; i < arr.length; i++) {
            res = Math.max(res, arr[i]);
        }
        System.out.println("The maximum number in the array is "+res);
        return res;
    }
    
}
public class MinMaxArray {
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number of array elements:");
        int n = s.nextInt();
        System.out.println("Enter the array elements:");
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = s.nextInt();
        }
        s.close();
        MaxMin c1 = new MaxMin();
        c1.getMin(arr,n);
        c1.getMax(arr,n);
    }
}