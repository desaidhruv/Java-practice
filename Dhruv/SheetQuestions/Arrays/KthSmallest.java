package SheetQuestions.Arrays;
import java.util.*;
public class KthSmallest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter array elements: ");
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        System.out.println(k);
        Arrays.sort(arr);
        for(int i = 0; i < n; i++) {
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
        sc.close();
        System.out.println("The smallest kth element is: "+arr[k]);
    }
}
