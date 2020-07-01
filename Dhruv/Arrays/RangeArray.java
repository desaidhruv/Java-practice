package Arrays;
import java.util.*;
public class RangeArray {
    public static int Min(int n,int arr[]){
        int res = arr[0];
        for (int i = 0; i < arr.length; i++) {
            res = Math.min(res, arr[i]);
        }
        return res;
    }
    public static int Max(int n,int arr[]){
        int res = arr[0];
        for (int i = 0; i < arr.length; i++) {
            res = Math.max(res, arr[i]);
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array");
        int n = s.nextInt();
        System.out.println("Enter the array:");
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = s.nextInt();
        }
        s.close();
        int a = Min(n,arr);
        int b = Max(n,arr);
        System.out.println("The minimum number in the array is: "+a);
        System.out.println("The maximum number in the array is: "+b);
        int range = a + b;
        System.out.println("The sum of minimum and maximum numbers in the array is:"+range);
    }
}