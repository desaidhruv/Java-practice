import java.util.*;

public class Min_in_Rotated_array {
    public static int Minimum(int[] arr){
        int low = arr[0];
        for(int i = 0; i < arr.length; i++){
            if(arr[i] < low){
                low = arr[i];
            }
        }
        return low;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter how many times you want to rotate:");
        int x = sc.nextInt();
        System.out.println("Enter how many elements in the array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter array:");
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        
        for(int i = 0; i < x; i++){
            int j,last;
            last = arr[arr.length - 1];
            
            for(j = arr.length-1; j > 0; j--){
                arr[j] = arr[j-1];
            }
            arr[0] = last;
        }
        System.out.println();

        System.out.println("After rotating:");
        for(int k: arr){
            System.out.print(k + " ");
        }
        System.out.println();
        int min = Minimum(arr);
        System.out.println("The minimum element in the array: " + min);
    sc.close();
    }
}