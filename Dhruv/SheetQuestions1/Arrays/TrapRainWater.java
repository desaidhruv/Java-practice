package SheetQuestions1.Arrays;

public class TrapRainWater {
    static void findTrappedWater(int[] array) {
        int sum = 0;
        int difference = 0;
        int border = 0;
        if(array[0] == array[array.length - 1]) {
            border = array[0];
        } else if(array[0] < array[array.length - 1]) {
            border = array[0];
        } else {
            border = array[array.length-1];
        }
        for (int i = 1; i <= array.length - 2; i++) {
            if (array[i] < border) {
                difference = border - array[i];
                sum = sum + difference;
            } else if(array[i] >= border){
                continue;
            }
        }
        System.out.println(sum);
    }
    public static void main(String[] args) {
        int array[] = {8, 8, 2, 4, 5, 5, 1};
        findTrappedWater(array);
    }
}
