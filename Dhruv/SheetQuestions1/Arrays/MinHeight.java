package SheetQuestions1.Arrays;
import java.util.*;

public class MinHeight {
    static void findMinHeight(int[] array, int k) {
        for(int i = 0; i < array.length; i++) {
            if(array[i] - k >= 0) {
                array[i] = array[i] - k;
            }
            else {
                array[i] = array[i] + k;
            }
        }
        Arrays.sort(array);
        int firstNum = array[0];
        int lastNum = array[array.length - 1];
        int result = lastNum - firstNum;
        System.out.print(result);
        // for(int i = 0; i < array.length; i++) {
        //     System.out.print(array[i]+" ");
        // }
    }
    public static void main(String[] args) {
        int[] array = {1, 5, 8, 10};
        int k = 2;
        findMinHeight(array,k);
    }
}
