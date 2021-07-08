package SheetQuestions1.Arrays;
import java.util.*;

public class MergeArray {
    static void mergeArray(int[] arr1, int[] arr2) {
        int i = 0;
        int temp = 0;

        // While loop till last element
        // of array 1(sorted)
        // is greater than first element
        // of array 2(sorted)
        while (arr1[arr1.length - 1] > arr2[0]) {
            if (arr1[i] > arr2[0]) {

                // Swap arr1[i] with first element
                // of arr2 and sorting the updated
                // arr2(arr1 is already sorted)
                // swap(arr1[i],arr2[0]);
                temp = arr1[i];
                arr1[i] = arr2[0];
                arr2[0] = temp;
                Arrays.sort(arr2);
            }
            i++;
        }
        Arrays.sort(arr1);
    }
    static void printArray(int arr[]) {
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int[] array1 = { 4, 5, 6, 7 };
        int[] array2 = { 1, 0, 2, 3 };
        mergeArray(array1, array2);
        printArray(array1);
        printArray(array2);
    }
}
