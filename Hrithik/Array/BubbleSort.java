
import java.util.*;

public class BubbleSort {

    void Bubble(int[] arr){
        int temp;
        int n = arr.length;
        for(int i = 1; i < n; i++){
            for(int j = 0; j < n-i; j++){
                if(arr[j] > arr[j+1]){
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        BubbleSort obj = new BubbleSort();
        obj.Bubble(arr);
        System.out.println("The sorted array: ");
        for(int k: arr){
            System.out.print(k + " ");
        }
        sc.close();
    }
}