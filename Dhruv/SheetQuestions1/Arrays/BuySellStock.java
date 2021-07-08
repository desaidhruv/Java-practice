package SheetQuestions1.Arrays;

public class BuySellStock {
    static int findMaxProfit(int[] array) {
        if(array.length == 0 || array == null) return 0;
        int minimum = array[0];
        int maxProfit = 0;
        for(int i = 0; i < array.length-1; i++) {
            if(array[i+1] <= array[i]){
                minimum = Math.min(minimum, array[i+1]);
            } else {
                maxProfit = Math.max(maxProfit, array[i+1]-minimum);
            }
        }
        return maxProfit;
    }
    public static void main(String[] args) {
        int[] array = {7,1,5,3,8,4};
        System.out.print(findMaxProfit(array));
    }
}
