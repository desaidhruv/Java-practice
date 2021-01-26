package Arrays;
import java.util.*;
public class MultiArray {
    public static void main(String[] args) {
        char[][] alphabets; //Multi-dimensional array initalizer
        Scanner s = new Scanner(System.in);
        System.out.println("Enter # of rows:");
        int rows = s.nextInt();
        System.out.println("Enter # of columns:");
        int cols = s.nextInt();
        alphabets = new char[rows][cols];
        s.nextLine();
        for (int i = 0; i < alphabets.length; i++) { //Accepting input from user
            for (int j = 0; j < alphabets.length; j++) {
                System.out.println("Enter a character at" + "["+i+"]"+"["+j+"]: ");
                alphabets[i][j] = s.nextLine().charAt(0);
            }
        }
        for (int i = 0; i < alphabets.length; i++) { //Displaying
            for (int j = 0; j < alphabets.length; j++) {
                System.out.print(alphabets[i][j]+ " ");
            }
            System.out.println();
        }
        s.close();
    }
}