package Algorithms;
//link to the video i reffered: https:www.youtube.com/watch?v=YxuK6A3SvTs
import java.util.*;
public class Kadane {
    public static int LargestSumContiguousSubarray(int arr[]){
        int meh = 0;
        int msf = 0;
        for (int i = 0; i < arr.length; i++) {
            meh = meh + arr[i];
            if(meh < arr[i]){
                meh = arr[i];
            }
            if(msf < meh){
                msf = meh;
            }
        }
        return msf;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the size of an array:");
        int n = s.nextInt();
        System.out.println("Enter the array elements:");
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = s.nextInt();
        }
        s.close();
        LargestSumContiguousSubarray(arr);

    }   
}