import java.util.*;
public class FindMin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter elements in the array");
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();
        System.out.println("Min value: " + min(arr));
    }
    public static int min(int[] arr) {
        int min = arr[0];
        for(int i = 1; i < arr.length; ++i){
            if(arr[i] < min){
                min = arr[i];
            }
        }
        return min;
    }
}