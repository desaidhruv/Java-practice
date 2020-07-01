import java.util.*;


public class Kth_Element {

    public static int Ksmall(int[] arr, int n){
        Arrays.sort(arr);
        return arr[n-1];
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter value of k");
        int k = sc.nextInt();
        System.out.println("K-th smallest number: " + Ksmall(arr, k));
        sc.close();
    }
}