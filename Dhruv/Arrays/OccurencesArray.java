package Arrays;
import java.util.*;
public class OccurencesArray {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number of elements:");
        int n = s.nextInt();
        System.out.println("Enter the number to count the occurences:");
        int occ = s.nextInt();
        System.out.println("Enter the array:");
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = s.nextInt();
        }
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == occ){
                count++;
            }
            
        }
        System.out.println("The number of occurrences are: "+count);
    }
}