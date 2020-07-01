
import java.util.*;

public class Occurance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter which element's occurance you want?");
        int key = sc.nextInt();
        for(int k : arr){
            if(k == key){
                count++;
                continue;
            }
        }
        System.out.println("Count of " + key + ": " + count);
        sc.close();
    }
}