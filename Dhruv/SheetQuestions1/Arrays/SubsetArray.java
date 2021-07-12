package SheetQuestions1.Arrays;

import java.util.HashSet;

public class SubsetArray {
    static void findSubset(int[] array1, int[] array2, int n1, int n2) {
        HashSet<Integer> hs = new HashSet<Integer>();
        for (int i = 0; i < n1; i++) {
            hs.add(array1[i]);
        }
        int length = hs.size();
        for(int i = 0;i < n2; i++) {
            hs.add(array2[i]);
        }
        if(hs.size() == length) {
            System.out.println("YESSS");
        }
        else {
            System.out.println("NOO");
        }
    }
    public static void main(String[] args) {
        int array1[] = {11, 1, 13, 21, 3, 7};
        int array2[] = {11, 3, 7, 1};
        int n1 = array1.length;
        int n2 = array2.length;
        findSubset(array1,array2,n1,n2);
    }
}
