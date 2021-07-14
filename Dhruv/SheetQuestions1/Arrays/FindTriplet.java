package SheetQuestions1.Arrays;

import java.util.Arrays;

public class FindTriplet {
    static boolean find3Num(int[] array, int X) {
        int l,r;
        Arrays.sort(array);
        for (int i = 0; i < array.length - 2; i++) {
            l = i+1;
            r = array.length - 1;
            while(l < r) {
                if(array[i] + array[l] + array[r] == X) {
                    return true;
                }
                else if(array[i] + array[l] + array[r] < X) {
                    l++;
                }
                else {
                    r--;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int array[] = {1, 4, 45, 6, 10, 8};
        int X = 13;
        System.out.println(find3Num(array,X));
    }
}
