package SheetQuestions.Arrays;

public class Kadane {
    static int KadaneAlgo(int array[]) {
        int meh = 0, max_so_far = 0; // meh = Max_ending_here.
        for(int i = 0; i < array.length; i++) {
            meh = meh + array[i];
            if( meh < array[i]) {
                meh = array[i];
            }
            // compares only when meh is greater
            else if(max_so_far < meh) {
                max_so_far = meh;
            }
        }
        return max_so_far;
    }
    public static void main(String[] args) {
        int array[] = {-1,2,-3,4,5};
        System.out.println("Largest Sum Contiguous subarray is: "+KadaneAlgo(array));
    }    
}
