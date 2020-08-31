package Arrays;
import java.util.*;
public class Common {
    public static void CommonArray(int[] arr1,int[] arr2,int[] arr3){
        for (int i = 0; i < arr1.length; i++) { // Common elements.
            for (int j = 0; j < arr2.length; j++) {
                for (int j2 = 0; j2 < arr3.length; j2++) {
                    if(arr1[i] == arr2[j] && arr2[j] == arr3[j2]){
                        System.out.println("The common element is: "+ arr1[i]);
                    }
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int n = s.nextInt();
        System.out.println("Enter the array elements: ");
        int[] arr1 = new int[n];
        int[] arr2 = new int[n];
        int[] arr3 = new int[n];
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = s.nextInt();
        }
        
        System.out.println("Enter the array elements: ");
        
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = s.nextInt();
        }

        System.out.println("Enter the array elements: ");
        
        for (int i = 0; i < arr3.length; i++) {
            arr3[i] = s.nextInt();
        }

        CommonArray(arr1,arr2,arr3);
        s.close();
    }
}
