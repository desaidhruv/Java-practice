package SheetQuestions.Arrays;
import java.util.*;

public class SubArrayZero {
    static void UnOpSubArrayExists(int arr[], int n) {
        int flag = 0;
        for(int i = 0; i < n; i++) {
            int s = 0;
            for(int j=i; j < n; j++) {
                s = s + arr[j];
                if(s == 0) {
                    flag = 1;
                    break;
                }
            }
            if(flag == 1 ) {
                break;
            }
        }
        if(flag == 1) {
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }
    }
    static void OpSubArrayExists(int arr[], int n) {
        ArrayList<Integer> res = new ArrayList<Integer>();
        int flag=0,s=0;
        for(int i = 0; i < n; i++) {
            s = s + arr[i];
            if(s == 0 || arr[i] == 0 ) {
                flag = 1;
                break;
            }
            else if(!res.contains(arr[i])) {
                flag = 1;
                break;
            }
            else {
                res.add(arr[i]);
            }
        }
        if(flag == 1) {
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }
    }
    public static void main(String[] args) {
        int arr[] = {4,-3,1,2,6};
        int n = arr.length;
        UnOpSubArrayExists(arr,n);
        OpSubArrayExists(arr,n);
    }    
}
