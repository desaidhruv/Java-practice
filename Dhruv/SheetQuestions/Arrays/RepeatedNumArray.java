package SheetQuestions.Arrays;
import java.util.*;
public class RepeatedNumArray {
    static int findDuplicate(int arr[]) {
        int duplicate = 0;
        for(int i=0;i<arr.length;i++) {
            for(int j=i+1;j<arr.length;j++) {
                if(arr[i] == arr[j]) {
                    duplicate = arr[i];
                    break;
                }
            }
        }
        return duplicate;
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
