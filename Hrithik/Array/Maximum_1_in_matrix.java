import java.util.*;

/**
 * Maximum_1_in_matrix
 */
public class Maximum_1_in_matrix {
    public static int Max1row(int[][] matrix){
        int row = 0;
        int i = 0;
        int j = matrix[0].length - 1;
        while(i < matrix.length-1 && j>=0){
            if(matrix[i][j] == 1){
                j--;
                row = i;
            } else {
                i++;
            }
        }
        return row+1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();
        int[][] arr = new int[row][col];

        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j<arr[i].length; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        int max1 = Max1row(arr);
        System.out.println("The maximum number of 1 in row is: " + max1);
        sc.close();
    }
}