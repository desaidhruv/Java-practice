package Arrays;
import java.util.*;
public class LargeFact {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the size of an array:");
        int n = s.nextInt();
        System.out.println("Enter the array elements:");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }
        s.close();
        Arrays.sort(arr);
        int high = arr[n-1];
        int fact = 1;
        for(int i = 1; i <= high;i++){
            fact = fact * i;
        }
        System.out.println("The Factorial of largest number in the array is "+ fact);
    }
}