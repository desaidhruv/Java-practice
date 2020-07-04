import java.util.*;

public class FirstRepeatingElement {
    public static void  RepeatingElement(int[] arr){
        
        int count = 0;
        for(int i = 0; i < arr.length; i++){
            for( int j = i+1; j < arr.length; j++){
                if(arr[i] == arr[j]){
                    count = arr[i];
                }
            }
        }
        System.out.println(count);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        System.out.println("Enter array elements");
        for(int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        RepeatingElement(a);
        sc.close();
    }
}