package SheetQuestions1.Arrays;

public class RearrangePosNeg {
    static void getPosNeg(int arr[], int n) {
        int i = 0;
        int j = n - 1;
        while (i <= j) {
            if (arr[i] < 0 && arr[j] > 0) {
                // Swapping elements.
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            } else if (arr[i] > 0 && arr[j] < 0) {
                i++;
                j--;
            } else if (arr[i] > 0) {
                i++;
            } else if (arr[j] < 0) {
                j--;
            }
        }
        if ((i == 0) || (i == n)) {
            printArray(arr);
        } else {
            int k = 0;
            while (k < n && i < n) {
                // Swapping elements.
                int temp = arr[k];
                arr[k] = arr[i];
                arr[i] = temp;
                k = k + 2;
                i++;
            }
            printArray(arr);
        }
        // System.out.println(i);
        // printArray(arr);
    }

    static void printArray(int arr[]) {
        for (int k = 0; k < arr.length; k++) {
            System.out.print(arr[k] + " ");
        }
    }

    public static void main(String[] args) {
        int arr[] = { 2, 3, -4, -1, 6, -9 };
        int n = arr.length;
        getPosNeg(arr, n);
    }
}
