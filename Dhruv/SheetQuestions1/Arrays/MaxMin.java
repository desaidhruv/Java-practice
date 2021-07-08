package SheetQuestions1.Arrays;
import java.util.*;

public class MaxMin {
    static void minNum(int[] array) {
        int minimum = array[0];
        for(int i = 1; i < array.length; i++) {
            if(array[i] < minimum) {
                minimum = array[i];
            }
        }
        System.out.println(minimum);
    }
    static void maxNum(int[] array) {
        int maximum = array[0];
        for(int i = 1; i < array.length; i++) {
            if(array[i] > maximum) {
                maximum = array[i];
            }
        }
        System.out.println("The "+maximum);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of Array:");
        int n = sc.nextInt();
        System.out.println("Enter the Array Elements:");
        int[] array = new int[n];
        for(int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
        sc.close();
        minNum(array);
        maxNum(array);
    }
}
