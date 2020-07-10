import java.util.*;

public class Triplet_equal_to_sum {
    public static void Check(int[] a, int sum){
        for(int i=0; i<a.length-2; i++){
            for(int j = i+1; j < a.length-1; j++){
                for(int k = j+1; k < a.length; k++){
                    if(a[i]+a[j]+a[k] == sum){
                        System.out.println("Triplets are :" + a[i] + "," + a[j] + "," + a[k]);
                        break;
                    } else {
                        System.out.println("There are no triplets in the array");
                    }
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter array:");
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter sum:");
        int sum = sc.nextInt();
        Check(arr, sum);
        sc.close();
    }
}