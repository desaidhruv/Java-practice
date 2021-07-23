package SheetQuestions1.Arrays;

public class MinSwapLessThanK {
    static int findMinSwap(int[] array, int k, int length) {
        int goodElement = 0, badElement = 0;
        for (int i = 0; i < length; i++) {
            if (array[i] <= k) goodElement++;
        }
        int minLength = Integer.MAX_VALUE;
        for (int i = 0; i < length; i++) {
            if (array[i] > k) badElement++;
        }
        int i = 0,j=goodElement-1;
        while (j < length) {
            minLength = Math.min(minLength, badElement);
            j++;
            if(j<length && array[j] > k) badElement++;
            if(array[i]>k) badElement--;
            i++;
        }
        if(minLength == Integer.MAX_VALUE) {
            return 0;
        }
        return minLength;
    }
    public static void main(String[] args) {
        int array[] = {2, 1, 5, 6, 3};
        int k = 3;
        int length = array.length;
        System.out.println(findMinSwap(array, k,length));
    }
}
