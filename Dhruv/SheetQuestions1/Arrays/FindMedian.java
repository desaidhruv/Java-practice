package SheetQuestions1.Arrays;

import java.util.*;

public class FindMedian {
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
        System.out.println(median);
    }
    public static void main(String[] args) {
        int array[] = {90, 100, 89, 67, 55};
        makeMiddle(array);
    }
}
