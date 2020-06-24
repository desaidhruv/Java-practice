package Stack.HackerRank;
import java.util.*;

public class SubArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array = new int[n];

        for(int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
        sc.close();

        int NegativeSubArray = 0;
        for(int i = 0; i < n; i++) {
            for(int j = i; j < n ; j++){
                int sum = 0;
                
                for(int k = i; k <= j; k++){
                    sum = sum + array[k];
                }
                if(sum < 0){
                    NegativeSubArray++;
                }
            }
        }
        System.out.println(NegativeSubArray);
    }
}