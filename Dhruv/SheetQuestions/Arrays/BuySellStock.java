package SheetQuestions.Arrays;

public class BuySellStock {
    static int getMaxProfit(int arr[]) {
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        for(int i = 0; i < arr.length; i++) {
            if (minPrice > arr[i]) {
                minPrice = arr[i];
            }
            else if (arr[i] - minPrice > maxProfit) {
                maxProfit = arr[i] - minPrice;
            }
        }
        return maxProfit;
    }
    public static void main(String[] args) {
        int arr[] = {7,1,5,3,6,4};
        System.out.println("The maximum profit is: "+getMaxProfit(arr));
    }
}
