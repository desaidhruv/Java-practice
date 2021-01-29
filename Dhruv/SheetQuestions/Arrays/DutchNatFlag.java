package SheetQuestions.Arrays;
import java.util.*;
public class DutchNatFlag {
    static void DNF(int arr[],int n) {
        int low = 0, mid = 0, high = n-1,temp=0;
        while(mid <= high) {
            switch(arr[mid]) {
                case 0: {
                    temp = arr[low];
                    arr[low] = arr[mid];
                    arr[mid] = temp;
                    low++;
                    mid++;
                    break;
                }
                case 1: {
                    mid++;
                    break;
                }
                case 2: {
                    temp = arr[mid];
                    arr[mid] = arr[high];
                    arr[high] = temp;
                    high--;
                    break;
                }
            }
        }
    }
    static void printArray(int arr[], int n) {
        for(int i = 0; i < n; i++) {
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int n =  sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            System.out.println("Enter array elements: ");
            arr[i] = sc.nextInt();
        }
        DNF(arr,n);
        printArray(arr,n);
        sc.close();
    }
}
