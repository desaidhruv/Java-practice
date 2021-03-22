package SheetQuestions.Arrays;

public class BubbleSort {
    static void SortTheBubble(int arr[]) {
        int temp = 0;
        for(int i = 0; i<arr.length; i++) {
            int flag = 0;
            for(int j = 0; j < arr.length -1 -i; j++) {
                if (arr[j] > arr[j+1] ) {
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    flag = 1;
                }
            }
            if(flag == 0) {
                break;
            }
        }
        printArray(arr);
    }
    static void printArray(int arr[]) {
        for(int k = 0; k < arr.length; k++) {
            System.out.print(arr[k] + " ");
        }
    }
    public static void main(String[] args) {
        int arr[] = { 25, 40, 28, 72, 18, 22 };
        SortTheBubble(arr);
    }
}
