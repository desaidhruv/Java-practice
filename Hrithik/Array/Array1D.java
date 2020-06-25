package Array;
import java.util.*;

public class Array1D {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int count = sc.nextInt();
    int[] arr = new int[count];
        for(int i = 0; i < count; i++){
            arr[i] = sc.nextInt();
        }
        sc.close();
        System.out.println("Reversed Array: ");
        for(int i = arr.length-1; i >= 0; i--){
            System.out.print(" " + arr[i]);
        }
    }
	
}