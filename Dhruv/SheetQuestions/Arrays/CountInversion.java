package SheetQuestions.Arrays;

public class CountInversion {
    public static void main(String[] args) {
        int arr[] = {2,4,1,3,5};
        int count = 0, i = 0;
        while(i < 5) {
            for(int j = i+1;j<5;j++) {
                if(arr[i] > arr[j]) {
                    count++;
                }
            }
            i++;
        }
        System.out.println(count);
    }
}
