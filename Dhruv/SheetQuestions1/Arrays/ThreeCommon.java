package SheetQuestions1.Arrays;

import java.util.*;

public class ThreeCommon {
    static void findCommon(ArrayList<Integer> A, ArrayList<Integer> B, ArrayList<Integer> C) {
        HashSet<Integer> intersection = new HashSet<Integer>();
        for (int i = 0; i < A.size(); i++) {
            intersection.add(A.get(i));
        }
        for (int i = 0; i < B.size(); i++) {
            intersection.add(B.get(i));
        }
        for (int i = 0; i < C.size(); i++) {
            if (intersection.contains(C.get(i))) {
                System.out.print(C.get(i) + " ");
            }
        }
    }

    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<Integer>(Arrays.asList(new Integer[] { 1, 5, 10, 20, 40, 80 }));
        ArrayList<Integer> B = new ArrayList<Integer>(Arrays.asList(new Integer[] { 6, 7, 20, 80, 100 }));
        ArrayList<Integer> C = new ArrayList<Integer>(Arrays.asList(new Integer[] { 3, 4, 15, 20, 30, 70, 80, 120 }));
        findCommon(A, B, C);

    }
}
