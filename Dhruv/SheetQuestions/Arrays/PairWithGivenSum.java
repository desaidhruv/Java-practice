package SheetQuestions.Arrays;

import java.util.HashMap;

public class PairWithGivenSum {
    static int getPair(int arr[],int k, int count) {
        for(int i = 0; i < arr.length - 1; i++) {
            for(int j=i+1;j<arr.length;j++) {
                if(arr[i] + arr[j] == k) {
                    count++;
                }
            }
        }
        return count;
    }
    static int getOptimisedPair(int arr[],int k, int count) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0; i < arr.length; i++) {
            if(map.containsKey(k - arr[i])) {
                count++;
            }
            map.put(arr[i], i);
        }
        return count;
    }
    public static void main(String[] args) {
        int arr[] = {1, 5, 7, 1};
        int k = 6, count = 0;
        System.out.println("Not Optimised Solution: "+ getPair(arr,k,count));
        System.out.println("Optimised Solution: "+ getOptimisedPair(arr,k,count));
    }
}
