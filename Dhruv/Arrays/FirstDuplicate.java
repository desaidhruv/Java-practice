package Arrays;
import java.util.*;
public class FirstDuplicate {
    public static void find1Duplicate(int array[]){
        int min = -1;
        HashSet<Integer> set = new HashSet<>();
        for(int i = array.length-1;i>=0;i--){
            if(set.contains(array[i])){
                min = i;
            }
            else{
                set.add(array[i]);
            }
        }
        if(min != -1){
            System.out.println("The first repeating number is: "+array[min]);
        }
        else{
            System.out.println("There are no repeating elements.");
        }
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
        find1Duplicate(arr);
    }
}