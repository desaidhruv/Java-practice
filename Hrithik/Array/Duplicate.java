import java.util.*;

public class Duplicate {
    public static void duplicate(int[] array){
        ArrayList<Integer> list = new ArrayList<Integer>();

        for(int i= 0 ; i < array.length; i++){
            for(int j= i+1 ; j < array.length ; j++){
                if(array[i] == array[j]){
                    list.add(array[i]);
                }
            }
        }
        for(int k: list){
            System.out.print(k + " ");
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);  
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        duplicate(arr);
        sc.close();
    }
}