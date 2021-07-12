package SheetQuestions1.Arrays;

import java.util.*;

public class nkTimes {
    static void findnkTimes(int[] array, int k, int n) {
        HashMap<Integer, Integer> mp = new HashMap<Integer, Integer>();
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (mp.containsKey(array[i])) {
                mp.put(array[i], mp.get(array[i]) + 1);
            } else {
                mp.put(array[i], 1);
            }
        }
        // Traverse through map and print frequencies
        for (Map.Entry<Integer, Integer> entry : mp.entrySet()) {
            if(entry.getValue() > (n/k)) {
                count++;
                // System.out.println(entry.getKey() + " " + entry.getValue());
            }
        }
        System.out.print(count);
    }

    public static void main(String[] args) {
        int[] array = { 3,1,2,2,1,2,3,3 };
        int k = 4;
        int n = array.length;
        findnkTimes(array, k, n);
    }
}
