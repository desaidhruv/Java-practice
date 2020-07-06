import java.util.*;

public class Quick_Sort {
    private static void QuickSort(int[] arr, int low, int high){
        int index = partition(arr, low, high);

        if(low < index-1)
            QuickSort(arr, low, index-1);
        if(index < high)
            QuickSort(arr, index, high);
    }
    private static int partition(int[] arr, int low, int high){
        // generate pivot element here the pivot is mid
        int pivot = arr[(low + high)/2];

        int i = low , j = high;
        while(i <= j){
            // compare and place all the values < pivot are to the left and values > pivot are to the right
            while(arr[i] < pivot) i++;
            while(arr[j] > pivot) j--;

            // swap the numbers 
            if(i <= j){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                
                // after swapping increment the values and check again
                i++;
                j--;
            }

        }
        return i;
    }
    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        QuickSort(arr, 0, arr.length-1);
        for(int k : arr){
            System.out.print(k + " ");
        }
        sc.close();
    }
}