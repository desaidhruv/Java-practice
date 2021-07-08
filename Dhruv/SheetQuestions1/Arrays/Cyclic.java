package SheetQuestions1.Arrays;
import java.util.*;

public class Cyclic {
    static void rotateArray(int array[]) {
        int last = array[array.length - 1];
        for(int i = array.length -1; i > 0; i--) {
            array[i] = array[i-1];
        }
        array[0] = last;
        for(int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
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
        rotateArray(array);
    }
}
