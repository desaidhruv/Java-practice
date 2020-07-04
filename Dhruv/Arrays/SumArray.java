package Arrays;
import java.util.*;
public class SumArray {
    public static void findSum(int[] array, int start){
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = i+1; j < (array.length); j++) {
                if(array[i]  + array[j] == start) {
                    sum++;
                }
            }
        }
        System.out.printf("Sum is %d",sum);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array:");
        int n = sc.nextInt();
        System.out.println("Enter the array elements:");
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the number you want to find sum of:");
        int k = sc.nextInt();
        sc.close();
        findSum(arr,k);
    }
}