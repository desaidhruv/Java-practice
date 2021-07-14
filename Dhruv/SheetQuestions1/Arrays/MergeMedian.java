package SheetQuestions1.Arrays;

import java.util.*;

public class MergeMedian {
    static void findMedian(int[] array1, int[] array2, int[] array3) {
        for (int i = 0; i < array1.length; i++) {
            array3[i] = array1[i];
        }
        for (int i = 0; i < array2.length; i++) {
            array3[array1.length + i] = array2[i];
        }
        Arrays.sort(array3);
    }
    static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
    static void makeMiddle(int[] array) {
        Arrays.sort(array);
        int[] a;
        int median = 0;
        if (array.length %2 == 0) {
            // even-length array (two middle elements)
            a = new int[2];
            a[0] = array[(array.length/2) - 1];
            a[1] = array[array.length/2];
            median = (a[0] + a[1]) / 2;
        } else {
            // odd-length array (only one middle element)
            a = new int[1];
            a[0] = array[array.length/2];
            median = a[0];
        }
        System.out.println("The median is: "+median);
    }
    public static void main(String[] args) {
        int array1[] = {-5, 3, 6, 12, 15};
        int array2[] = {-12, -10, -6, -3, 4, 10};
        int finalSize = array1.length + array2.length;
        int array3[] = new int[finalSize];
        findMedian(array1, array2, array3);
        printArray(array3);
        makeMiddle(array3);
    }
}
