package Arrays;
import java.util.*;
public class ReverseArray {
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
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i]+" ");
        }
    }
}