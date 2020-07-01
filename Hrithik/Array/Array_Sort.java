
import java.util.Arrays;
import java.util.Scanner;

public class Array_Sort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        System.out.printf("Sorted Array: %s", Arrays.toString(arr));
        sc.close();
    }
}