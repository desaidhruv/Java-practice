// Video for reference: https://www.youtube.com/watch?v=1s0r7Ixir80

import java.util.*;

/**
 * MaxProductSubarray
 */
public class MaxProductSubarray {
    public static int MaximumProductSum(int[] arr){
        
        if(arr.length == 0) return -1;
        int final_max  = arr[0];
        int current_max = arr[0];
        int current_min = arr[0];

        for(int i = 1; i < arr.length; i++){
            int temp = current_max;
            current_max = Math.max(Math.max(current_max * arr[i], current_min * arr[i]), arr[i]);
            current_min = Math.min(Math.min(temp * arr[i], current_min * arr[i]), arr[i]);

            if(current_max > final_max){
                final_max = current_max;
            }
        }
        return final_max;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[]  a = new int[n];
        for(int i = 0; i < n; i++){
            a[i] = sc.nextInt();
        }
        System.out.println("Max product of subarray: " + MaximumProductSum(a));
        sc.close();
    }
}