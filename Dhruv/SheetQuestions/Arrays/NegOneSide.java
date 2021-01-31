package SheetQuestions.Arrays;
import java.util.*;
public class NegOneSide {
    static void Rearrange(int arr[],int n) {
        int j = 0, temp;
        for(int i = 0; i < n; i++) {
            if(arr[i] < 0) {
                if(i != j) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
                j++;
            }
        }
    }
    static void printArray(int arr[], int n) {
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
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
        Rearrange(arr,n);
        printArray(arr,n);
        sc.close();
    }
}
