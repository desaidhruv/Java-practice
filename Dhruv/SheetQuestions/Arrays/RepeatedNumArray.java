package SheetQuestions.Arrays;
import java.util.*;
public class RepeatedNumArray {
    static int findDuplicate(int arr[]) {
        Set<Integer> seen = new HashSet<Integer>();
        for(int num : arr) {
            if(seen.contains(num)) {
                return num;
            }
            seen.add(num);
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter array elements: ");
            arr[i] = sc.nextInt();
        }
        int duplicate = findDuplicate(arr);
        System.out.println("The duplicate number in the array is: "+duplicate);
        sc.close();
    }
}
