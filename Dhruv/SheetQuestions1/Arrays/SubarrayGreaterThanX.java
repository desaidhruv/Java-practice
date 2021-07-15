package SheetQuestions1.Arrays;

public class SubarrayGreaterThanX {
    static void findSubarray(int[] array, int X, int length) {
        int start = 0, end = 0, ans = length+1, sum = 0;
        while( end < length) {
            while (sum < X && end < length) {
                sum += array[end];
                end++;
            }
            while (sum > ans && start < length) {
                ans = Math.min(ans, end-start);
                sum -= array[start];
                start++;
            }
        }
        System.out.println(ans);
    }
    public static void main(String[] args) {
        int array[] =  {1, 4, 45, 6, 0, 19};
        int X = 51;
        int length = array.length;
        findSubarray(array, X, length);
    }
}
