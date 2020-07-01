import java.util.*;


public class Range {

    public static int Max(int[] arr){
        int max = 0;
        for(int k: arr){
            if(k > max){
                max = k;
            }
        }
        return max;
    }

    public static int Min(int[] arr){
        int min = arr[0];
        for(int k: arr){
            if(k < min){
                min = k;
            }
        }
        return min;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i< n; i++){
            arr[i] = sc.nextInt();
        }
        int a = Max(arr);
        int b = Min(arr);
        System.out.println("Max: " + a);
        System.out.println("Min: " + b);
        int range = a-b;
        System.out.println("Range : " + range);
        sc.close();
    }
}