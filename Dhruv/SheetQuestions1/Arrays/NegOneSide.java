package SheetQuestions1.Arrays;
import java.util.*;

public class NegOneSide {
    static void rearrangeArray(int[] array) {
        for(int i = 0; i < array.length;i++) {
            for(int j = i+1;j < array.length;j++) {
                if(array[i] > array[j]) {
                    int temp = array[j];
                    array[j] = array[i];
                    array[i] = temp;
                }
            }
        }
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
        rearrangeArray(array);
    }
}
