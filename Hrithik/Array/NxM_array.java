import java.util.*;

public class NxM_array {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] array = new int[n][m];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                array[i][j] = sc.nextInt();
            }
        }
        System.out.println("The 2D array:");
        for(int k[] : array){
            for(int x : k){
                System.out.print(x + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}