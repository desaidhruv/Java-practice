package Arrays;
import java.util.*;
public class Largest3Elements {
    public static void largest3(int[] arr){
        ArrayList<Integer> list = new ArrayList<Integer>();
        for(int i = arr.length-1;i >= 0; i--){
            list.add(arr[i]);
            if( i < 2){
                break;
            }
        }
        for(int k: list){
            System.out.print(k + " ");
        }
    }
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
        largest3(arr);
        
    }
}