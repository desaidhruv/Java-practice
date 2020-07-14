package Arrays;
import java.util.*;
public class MinCyclic {
    public static void shift(int[] array){
        int x = array[array.length - 1];
        for(int i = array.length-1; i>0; i--){
            array[i] = array[i-1];
        }
        array[0] = x;
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+" ");
        }
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
        System.out.println("The shifted array is:");
        shift(arr);
        int low = arr[1];
        System.out.println("Lowest: "+low);
        sc.close();
    }
}