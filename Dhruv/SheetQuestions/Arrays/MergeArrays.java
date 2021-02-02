package SheetQuestions.Arrays;
import java.util.*;
public class MergeArrays {
    static void MergeArray(int arr1[],int arr2[]) {
        int n = arr1.length;
        int m = arr2.length;
        // Consider each element `arr1[i]` of array `arr1` and ignore the element if it is
        // already in the correct order; otherwise, swap it with the next smaller
        // element, which happens to be the first element of `arr2`.
        for(int i = 0; i < n; i++) {
            // compare the current element of `arr1[]` with the first element of `arr2[]`
            if(arr1[i] > arr2[0]) {
                // swap `arr1[i] with `arr2[0]`
                int temp = arr1[i];
                arr1[i] = arr2[0];
                arr2[0] = temp;
            }
            int first = arr2[0];

            int k;
            // move `arr2[0]` to its correct position to maintain the sorted
            // order of `arr2[]`.
            for(k = 1; k < m && arr2[k] < first;k++) {
                arr2[k-1] = arr2[k];
            }
            arr2[k - 1] = first;
        }
    }
    static void printArray(int arr[]) {
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr1 = {1,4,7,8,10};
        int[] arr2 = {2,3,9};
        MergeArray(arr1,arr2);
        printArray(arr1);
        System.out.println();
        printArray(arr2);
        sc.close();
    }
}
