package SheetQuestions1.Arrays;

public class PairWithGivenSum {
    static void unOptimisedfindPair(int[] array, int k) {
        int count = 0;
        for(int i = 0;i<array.length-1;i++){
            for(int j = i+1;j<array.length;j++){
                if(array[i]+array[j] == k) {
                    count++;
                }
            }
        }
        System.out.println("Unoptimised Count:" + count);
    }
    static void optimisedfindPair(int[] array, int k) {
        int count = 0;
        for(int i = 0; i < array.length-1; i++) {
            if(array[i]+array[i+1] == k) {
                count++;
            }
        }
        System.out.println("Optimised Count:" + count);
    }
    public static void main(String[] args) {
        int[] array = {1, 1, 1, 1};
        int k = 2;
        unOptimisedfindPair(array,k);
        optimisedfindPair(array,k);
    }
}
