import java.util.*;

public class SubArraywithSum0 {
    public static boolean sum0(int[] arr){
        int sum = 0;

        Set<Integer> hs = new HashSet<Integer>();

        for(int i = 0; i < arr.length; i++){
            sum = sum + arr[i];

            // Important point to understand:🤨
            // Return true if -> 
            // a) Current element is 0 
            // b) sum of elements from 0 to i is 0 
            // c) sum is already present in hash map
            if(sum == 0 || arr[i] == 0 || hs.contains(sum)){
                return true;
            }
            hs.add(sum);
            
        }   
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter how many elements in an array:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter array elements:");
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        if(sum0(arr)){
            System.out.println("The subarray with sum 0 exist.");
        } else {
            System.out.println("The subarray with sum 0 does not exist.");
        }
        sc.close();
    }
}