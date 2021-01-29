package SheetQuestions.Arrays;
import java.util.*;
public class MinMaxArray {
    static class Pair {
        int min;
        int max;
    }
    static Pair getMinMax(int array[], int n) {
        Pair minmax = new Pair();
        //If there is only one element in the the array.
        if(n==1) {
            minmax.max = array[0];
            minmax.min = array[0];
            return minmax;
        }
        //If there are more than one element in the array, then initialise min and max.
        if(array[0] > array[1]) {
            minmax.min = array[0];
            minmax.max = array[1];
        } else {
            minmax.min = array[1];
            minmax.max = array[0];
        }
        for (int i = 2;i<n; i++) {
            if(array[i] > minmax.max) {
                minmax.max = array[i];
            }
            else if(array[i] < minmax.min) {
                minmax.min = array[i];
            }
        }
        return minmax;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int n = sc.nextInt();
        int[] array = new int[n];
        for(int i = 0; i<n; i++) {
            array[i] = sc.nextInt();
        }
        sc.close();
        Pair minmax = getMinMax(array, n);
        System.out.printf("\nMinimum element is %d", minmax.min);
        System.out.printf("\nMaximum element is %d", minmax.max);
    }
}
