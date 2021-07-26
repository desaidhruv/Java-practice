package SheetQuestions1.Arrays;

public class CountInversion {
    static void findInversion(int[] array, int length) {
        int countInversion = 0;
        for (int i = 0; i < array.length-1; i++) {
            for (int j = i+1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    countInversion++;
                }
            }
        }
        System.out.println("Inversion Count:" + countInversion);
    }
    public static void main(String[] args) {
        int array[] = {2, 4, 1, 3, 5};
        int length = array.length;
        findInversion(array,length);
    }
}
