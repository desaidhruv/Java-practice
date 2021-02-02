package SheetQuestions.Arrays;

public class MaxProdSubarray {
    static long getMax(long arr[]) {
        long maxi = arr[0],mini=arr[0],maxpro=arr[0];
        for(int i = 1; i < arr.length; i++) {
            // if -ve value is encountered,
            // maxi becomes mini
            // mini becomes maxi
            if(arr[i] < 0) {
                long temp = maxi;
                maxi = mini;
                mini = temp;
            }
            // maxVal and minVal stores the
            // product of subarray ending at arr[i].
            maxi = Math.max(arr[i],maxi*arr[i]);
            mini = Math.min(arr[i],mini*arr[i]);
            // Max Product of array.
            maxpro = Math.max(maxpro,maxi);
        }
        return maxpro;
    }
    public static void main(String[] args) {
        long arr[] = {3,-5,8,-6,-4,7};
        System.out.println("The maximum product subarray is:" +getMax(arr));
    }    
}
