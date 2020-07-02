import java.util.*;

public class Cyclic {
    public static void shift(int[] arr){
        int x = arr[arr.length-1];
        for(int i=arr.length-1; i > 0; i--){
            arr[i] = arr[i-1];
        }
        arr[0] = x;
        for(int k : arr){
            System.out.print(k + " ");
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] array = new int[n];
        for(int i = 0; i<array.length; i++){
            array[i] = sc.nextInt();
        }
        System.out.println("The shifted array: ");
        shift(array);
        sc.close();
    }
}