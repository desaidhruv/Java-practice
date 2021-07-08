package SheetQuestions1.Arrays;
import java.util.*;

public class KthSmallestNum {
    static void findKSmallest(int[] array, int k) {
        Arrays.sort(array);
        int result = array[k];
        System.out.println("The smallest Kth element is: "+ result);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of Array:");
        int n = sc.nextInt();
        System.out.print("Enter the Array Elements:");
        int[] array = new int[n];
        for(int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
        System.out.println("Enter kth element:");
        int k = sc.nextInt();
        sc.close();
        findKSmallest(array,k);
    }
}
