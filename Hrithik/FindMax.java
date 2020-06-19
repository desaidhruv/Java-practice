import java.util.*;
public class FindMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();
        int arr[] = new int[n];
        for(int  i = 0; i<n; i++){
            System.out.println("Enter elements in the array");
            arr[i] = sc.nextInt();
        }
        sc.close();
        System.out.println("Max value in the array " + max(arr));
        
    }
    public static int max(int[] arr) {
        int max = arr[0];
        for(int i = 1; i < arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }
}