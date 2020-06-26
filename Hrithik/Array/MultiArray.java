import java.util.*;

public class MultiArray {
    public static void main(String[] args) {
        // Initialize  MultiDimensional array
        char[][] letters;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter of rows:");
        int row = sc.nextInt();

        System.out.println("Enter of columns:");
        int col = sc.nextInt();


        letters = new char[row][col];
        sc.nextLine();
        // Accept array 
        for(int i = 0; i < letters.length; i++){
            for(int j = 0; j < letters.length; j++){
                System.out.println("Enter Character at" + "[" + i + "][" + j + "]:");
                letters[i][j] = sc.nextLine().charAt(0);
            }
        }
        // Display Array 
        for(int i = 0; i < letters.length; i++){
            for(int j = 0; j < letters.length; j++){
                System.out.print(letters[i][j] + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}