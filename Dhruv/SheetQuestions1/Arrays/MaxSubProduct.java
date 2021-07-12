package SheetQuestions1.Arrays;

public class MaxSubProduct {
    static long findProduct(int[] array) {
        // Variables to store maximum and minimum
        // product till ith index.
        long minVal = array[0];
        long maxVal = array[0];

        long maxProduct = array[0];

        for (int i = 1; i < array.length; i++) {

            // When multiplied by -ve number,
            // maxVal becomes minVal
            // and minVal becomes maxVal.
            if (array[i] < 0) {
                long temp = maxVal;
                maxVal = minVal;
                minVal = temp;
            }

            // maxVal and minVal stores the
            // product of subarray ending at arr[i].
            maxVal = Math.max(array[i], maxVal * array[i]);
            minVal = Math.min(array[i], minVal * array[i]);

            // Max Product of array.
            maxProduct = Math.max(maxProduct, maxVal);
        }

        // Return maximum product found in array.
        return maxProduct;
    }

    public static void main(String[] args) {
        int[] array = { 6, -3, -10, 0, 2 };
        System.out.println("The maximum subarray product is: "+findProduct(array));
    }
}
