package Arrays;
import java.util.*;
public class FirstNonrepeating {
    public static void nonRepeat(int[] arr, int n){
        for (int i = 0; i < arr.length; i++) {
            int j;
            for ( j = 0; j < arr.length; j++) {
                if(j != i && arr[i] == arr[j]){
                    break;
                }
            }
            if(j == n){
                System.out.println(arr[i]+ " ");
            }
        }
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number of elements:");
        int n = s.nextInt();
        System.out.println("Enter the array:");
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = s.nextInt();
        }
        s.close();
        nonRepeat(arr,n);
        
    }
}