import java.util.*;

public class Occurance2 {
    public static void Repetitive(int[] a){

        for(int i = 0; i < a.length; i++){
            for(int j = i+1; j < a.length; j++){
                if(a[i] == a[j]){
                    System.out.print(a[i] + " ");
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("The 2 repetitive elements are: ");
        Repetitive(arr);
        sc.close();
    }
}