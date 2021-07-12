package SheetQuestions1.Arrays;
import java.util.*;

public class SubArraySum {
    static boolean findSubArray(int[] array) {
        HashMap<Integer, Integer> hM = new HashMap<Integer, Integer>();

        int sum = 0;

        // iterating over the array.
        for (int i = 0; i < array.length; i++) {
            // storing prefix sum.
            sum += array[i];

            // if prefix sum is 0 or if it is already present in Hashmap
            // then it is repeated which means there is a subarray whose
            // summation is 0, so we return true.
            if (sum == 0 || hM.get(sum) != null)
                return true;

            // storing every prefix sum obtained in Hashmap.
            hM.put(sum, i);
        }
        // returning false if we don't get any subarray with 0 sum.
        return false;
    }

    public static void main(String[] args) {
        int array[] = { 4, 2, -3, 1, 6 };
        System.out.print(findSubArray(array));
    }
}
