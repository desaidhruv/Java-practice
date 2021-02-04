package SheetQuestions.Arrays;

public class MinimiseHeightDiff {
    static int getMin(int arr[],int k) {
        int n = arr.length;
        int result = arr[n-1] - arr[0];
        for(int i = 1; i < n; i++) {
            int min = Math.min(arr[0]+k,arr[i]+k);
            int max = Math.max(arr[n-1]-k,arr[i-1]+k);
            result = Math.min(result, max-min);
        }
        return result;
    }
    public static void main(String[] args) {
        int arr[] = {1,5,8,10};
        int k = 2;
        System.out.println("The minimum height difference is: "+getMin(arr,k));
    }
}
