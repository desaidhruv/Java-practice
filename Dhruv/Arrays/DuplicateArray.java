package Arrays;
import java.util.*;
public class DuplicateArray {
    public static void findDuplicate(int[] array){
        int count = 1;
        for (int i = 0; i < array.length; i++) {
            for (int j = i+1; j < array.length; j++) {
                if(array[i] == array[j]){
                    count++;
                }
            }
        }
        System.out.println("Duplicate numbers: "+count);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in an array");
        int n = sc.nextInt();
        System.out.println("Enter the array:");
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();
        findDuplicate(arr);
    }
}