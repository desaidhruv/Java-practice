package SheetQuestions1.Arrays;

public class DuplicateNum {
    static void findDuplicate(int[] array) {
        // Arrays.sort(array);
        for(int i = 0; i < array.length - 1; i++) {
            for(int j = i+1; j < array.length; j++) {
                if(array[i] == array[j]) {
                    System.out.print(array[i] + " ");
                }
            }
        }
    }
    public static void main(String[] args) {
        int[] array = {1,3,4,2,2};
        findDuplicate(array);
    }
}
