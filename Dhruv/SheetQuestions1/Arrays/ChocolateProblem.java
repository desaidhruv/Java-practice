package SheetQuestions1.Arrays;

import java.util.Arrays;

public class ChocolateProblem {
    static void findMinDiff(int[] array, int numOfStudents, int length) {
        int ans = Integer.MAX_VALUE;
        Arrays.sort(array);
        for(int i = 0; i <= length - numOfStudents; i++ ) {
            int minV = array[i];
            int maxV = array[i + numOfStudents-1];
            int gap = maxV - minV;
            if (gap < ans) {
                ans = gap;
            }
        }
        System.out.println(ans);
    }
    public static void main(String[] args) {
        int array[] = {3, 4, 1, 9, 56, 7, 9, 12};
        int numOfStudents = 5;
        int length = array.length;
        findMinDiff(array, numOfStudents, length);
    }
}
