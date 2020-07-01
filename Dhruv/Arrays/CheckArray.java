package Arrays;
import java.util.*;
public class CheckArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array:");
        int n = sc.nextInt();
        System.out.println("Enter the number to find:");
        int n1 = sc.nextInt();
        System.out.println("Enter the numbers:");
        int[] arr = new int[n];
        
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();
        for (int i = 0; i < arr.length;) {
            if(arr[i] == n1) {
                System.out.println("The number "+ n1 +" is present.");
                break;
            }
            else{
                System.out.println("The number "+ n1 +" is not present in the array");
                break;
            }
        }

    }
}