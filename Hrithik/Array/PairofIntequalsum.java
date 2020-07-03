import java.util.*;

/**
 * PairofIntequalsum
 */
public class PairofIntequalsum {
    public static void Countpair(int[] arr, int sum){
        int count = 0;

        for(int i = 0; i < arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                if(arr[i]+arr[j] == sum){
                    count++;
                }
            } 
        }
        System.out.println(count);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter sum:");
        int sum = sc.nextInt();
        System.out.println("Enter size of array:");
        int n = sc.nextInt();
        
        int[] arr = new int[n];
        System.out.println("Enter array elements:");
        for(int k = 0; k<arr.length; k++){
            arr[k] = sc.nextInt();
        }
        Countpair(arr, sum);
        sc.close();
    }
    
}