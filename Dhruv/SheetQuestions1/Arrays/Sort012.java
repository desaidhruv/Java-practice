package SheetQuestions1.Arrays;
import java.util.*;

public class Sort012 {
    static void sortArray(int[] array) {
        int low = 0,high = array.length - 1,mid = 0;
        while(mid <= high) {
            if(array[mid] == 0) {
                int temp = array[low];
                array[low] = array[mid];
                array[mid] = temp;
                low++;
                mid++;
            }
            else if(array[mid] == 1) {
                mid++;
            }
            else {
                int temp = array[high];
                array[high] = array[mid];
                array[mid] = temp;
                high--;
            }
        }
        for(int i= 0; i < array.length; i++) {
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
        sortArray(array);
    }
}
