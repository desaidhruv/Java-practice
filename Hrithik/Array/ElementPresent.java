import java.util.*;

public class ElementPresent {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i< n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the key value");
        int key = sc.nextInt();
        for(int k: arr){
            if(k == key){
                System.out.println(key + " is present in the array");
                
            } else {
                System.out.println(key + " is not present in the array");
                break;
            }
        }
        sc.close();
    }
}