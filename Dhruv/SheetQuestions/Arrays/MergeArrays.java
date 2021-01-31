package SheetQuestions.Arrays;
import java.util.*;
public class MergeArrays {
    static void MergeArray(int arr1[],int arr2[]) {
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        ArrayList<Integer> merged = new ArrayList<Integer>();
        for(int i = 0;i < arr1.length;i++) {
            merged.add(arr1[i]);
        }
        for(int i = 0;i < arr2.length;i++) {
            merged.add(arr2[i]);
        }
        Integer[] arr3 = new Integer[merged.size()];
        arr3 = merged.toArray(arr3);
        for(Integer x: arr3) {
            System.out.print(x + " ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array1: ");
        int n = sc.nextInt();
        int[] arr1 = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter array1 elements: ");
            arr1[i] = sc.nextInt();
        }
        System.out.println("Enter the size of the array2: ");
        int m = sc.nextInt();
        int[] arr2 = new int[n];
        for (int i = 0; i < m; i++) {
            System.out.println("Enter array2 elements: ");
            arr2[i] = sc.nextInt();
        }
        MergeArray(arr1,arr2);
        sc.close();
    }
}
