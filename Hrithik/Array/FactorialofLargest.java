// Find	the	factorial of a large number.

import java.util.*;

public class FactorialofLargest {
    public static int max(int[] array){
        int max = 0;
        for(int k : array){
            if(k > max){
                max = k;
            }
        }
        return max;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int fact = 1;
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        int k = max(arr);
        System.out.println("Max: "+k);
        for(int i = 1; i <= k; i++){
            fact = fact * i;
        }
        System.out.println("The factorial of the max number is: " + fact);
        sc.close();
    }
}