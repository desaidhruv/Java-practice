import java.util.*;

public class Rotate_Right {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter how many times you want to rotate:");
        int x = sc.nextInt();
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter array:");
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Before rotating:");
        for(int k : arr){
            System.out.print(k + " ");
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
    sc.close();
    }
}