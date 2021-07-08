package SheetQuestions1.Arrays;

import java.util.*;

public class MergeInterval {
    static void mergeIntervals(int[][] arr, int n, int m) {
        for (int row = 0; row < m; row++) {
            for (int col = 0; col < n; col++) {
                System.out.print(arr[row][1]);
            }
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter rows");
        int m = sc.nextInt();
        System.out.println("enter columns");
        int n = sc.nextInt();
        int arr[][] = new int[m][n];
        System.out.println("enter array elements");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        mergeIntervals(arr, m, n);
        sc.close();
    }
}
