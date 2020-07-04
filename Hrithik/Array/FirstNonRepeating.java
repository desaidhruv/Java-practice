import java.util.*;

/**
 * FirstNonRepeating
 */
public class FirstNonRepeating {
    public static void Nonrepeat(int[] arr , int x){
        for(int i = 0; i < x; i++){
            int j;
            for(j = 0; j < x; j++){
                if(j != i && arr[i] == arr[j]){
                    break;
                }
            }
            
            if(j == x){
                System.out.print(arr[i] + " ");
            } 
        }
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i = 0; i<n; i++){
            a[i] = sc.nextInt();
        }
        int len = a.length;
        Nonrepeat(a,len);
        sc.close();
    }
    
}