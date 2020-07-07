package Algorithms;
import java.util.*;
public class Quick_Sort {
    private static void QuickSort(int[] arr,int left, int right) {
        int index = partition(arr, left, right);
        if(left < index-1)
            QuickSort(arr,left,index -1);
        if(index < right)
            QuickSort(arr,index,right);
    }
    private static int partition(int[] arr, int left, int right) {
        int pivot = arr[(left+right)/2];
        while(left <= right){
            // compare and place all the values < pivot are to the left and values > pivot are to the right
            while(arr[left] < pivot) left ++;
            while(arr[right] > pivot) right --;

            if(left <= right){
                // SWAP
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;

                left++;
                right--;
            }
        }
        return left;
    }
    static void printArray(int arr[]) 
    { 
        int n = arr.length; 
        for (int i=0; i<n; ++i) 
            System.out.print(arr[i]+" "); 
        System.out.println(); 
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number of elements: ");
        int n = s.nextInt();
        System.out.println("Enter the array elements you want to sort:");
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = s.nextInt();
        }
        s.close();
        QuickSort(arr,0,n-1);
        System.out.println("Sorted array:"); 
        printArray(arr);
    }
}