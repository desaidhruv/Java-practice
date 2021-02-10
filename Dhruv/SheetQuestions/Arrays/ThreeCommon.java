package SheetQuestions.Arrays;
import java.util.*;
public class ThreeCommon {
    static void getUnOptimisedIntersection(int arr1[], int arr2[], int arr3[]) {
        HashSet<Integer> intersection = new HashSet<Integer>();
        for(int i=0; i < arr1.length; i++) {
            intersection.add(arr1[i]);
        }
        for(int i = 0; i < arr2.length; i++) {
            intersection.add(arr2[i]);
        }
        for(int i=0;i<arr3.length;i++) {
            if(intersection.contains(arr3[i])) {
                System.out.print(arr3[i]+ " ");
            }
        }
    }
    static void getOptimisedIntersection(int arr1[], int arr2[], int arr3[]) {
        //Initialize i, j and k to point to the smallest 
        //element of array1, array2, and array3 respectively
        int i=0,j=0,k=0;
        // Iterate until any one array ends
        while(i<arr1.length && j<arr2.length && k<arr3.length) {
            if(arr1[i] == arr2[j] && arr2[j] == arr3[k]) {
                // Found the First element.
                System.out.print(arr1[i]+ " ");
                // Increment pointers.
                i++;j++;k++;
            } else if((arr1[i] <= arr2[j]) && (arr1[i] <= arr3[k])) {
                // arr1[i] is smallest, increment i
                i++;
            } else if((arr2[j] <= arr1[i]) && (arr2[j] <= arr3[k])) {
                // arr2[j] is smallest, increment j
                j++;
            } else if((arr3[k] <= arr1[i]) && (arr3[k] <= arr2[j])) {
                // arr3[k] is smallest, increment k
                k++;
            }
        }
    }
    public static void main(String[] args) {
        int arr1[] = {1, 5, 10, 20, 40, 80};
        int arr2[] = {6, 7, 20, 80, 100};
        int arr3[] = {3, 4, 15, 20, 30, 70, 80, 120};
        getUnOptimisedIntersection(arr1, arr2, arr3);
        System.out.println();
        getOptimisedIntersection(arr1, arr2, arr3);
    }
}
