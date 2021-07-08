package SheetQuestions1.Arrays;

public class Kadane {
    static int KadaneAlgo(int[] array) {
        int maxSoFar=0,maxEndingHere=0;
        for(int i = 0; i < array.length; i++) {
            maxEndingHere = maxEndingHere + array[i];
            if(maxEndingHere < array[i]) {
                maxEndingHere = array[i];
            }
            if(maxSoFar < maxEndingHere) {
                maxSoFar = maxEndingHere;
            }
        }
        return maxSoFar;
    }
    public static void main(String[] args) {
        int[] array = {-2,-3,4,-1,-2,1,5,-3};
        System.out.println("Largest Sum Contiguous subarray is: " + KadaneAlgo(array));
    }
}
