package SheetQuestions1.Arrays;
import java.util.*;

public class LongestSubsequence {
    static void findSubsequence(int[] array) {
        HashSet<Integer> hs = new HashSet<Integer>();
        int ans = 0;
        for (int i = 0; i < array.length; i++) {
            hs.add(array[i]);
        }
        for (int i = 0; i < array.length; i++) {
            if(!hs.contains(array[i]-1)) {
                int j = array[i];
                while (hs.contains(j)) {
                    j++;
                }
                if(ans < j - array[i]) {
                    ans = j - array[i];
                }
            }
        }
        System.out.println(ans);
    }
    public static void main(String[] args) {
        int array[] = {1,9,3,10,4,20,2};
        findSubsequence(array);
    }
}
