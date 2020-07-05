import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;

/**
 * Largest3Element
 */
public class Largest3Element {
    public static void large3(int[] a){
        ArrayList<Integer> list = new ArrayList<Integer>();
        
        for(int i = a.length-1; i >= 0; i--){
            list.add(a[i]);
            if(i <= 2){
                break;
            }
        }
        for(int k: list){
            System.out.print(k + " ");
        }
    }
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter elements in the array: ");
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("The three max elements are:");
        Arrays.sort(arr);
        large3(arr);
        sc.close();
    }
}