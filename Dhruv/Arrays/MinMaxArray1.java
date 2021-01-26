package Arrays;
import java.util.*;
public class MinMaxArray1 {
    static class Pair {
        int min;
        int max;
    }
    static Pair getMinMax(int arr[], int n){
        Pair minmax = new Pair();
        //If there is only one element in array.
        if(n==1) {
            minmax.min = arr[0];
            minmax.max = arr[0];
        }
        //if there is more than one element in array, then initialize min and max.
        if(arr[0] > arr[1]) {
            minmax.min = arr[0];
            minmax.max = arr[1];
        } else {
            minmax.min = arr[1];
            minmax.max = arr[0];

        }
        for(int i = 2; i < n; i++){
            if(arr[i] > minmax.max) {
                minmax.max = arr[i];
            }
            else if(arr[i] < minmax.min){
                minmax.min = arr[i];
            }
        }
        return minmax;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int n = sc.nextInt();
        int[] array = new int[n];
        for(int i = 0; i<n; i++) {
            array[i] = sc.nextInt();
        }
        sc.close();
        Pair minmax = getMinMax(array, n);
        System.out.printf("\nMinimum element is %d", minmax.min);
        System.out.printf("\nMaximum element is %d", minmax.max);
    }
}
