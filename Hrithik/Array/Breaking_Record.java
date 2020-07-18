
public class Breaking_Record {
    public static int[] findHigest(int[] arr){
        int max = arr[0], min = arr[0], max_count = 0, min_count = 0;
        
        int result[] = new int[2];

        for(int i = 1; i < arr.length; i++){
            if (arr[i] > max){
                max = arr[i];
                max_count++;
            } else if(arr[i] < min){
                min = arr[i];
                min_count++;
            }
            
            result[0] = max_count;
            result[1] = min_count;
        }
        return result;
    }
    public static void main(String[] args) {
    int[] scores = {3, 4, 21, 36, 10, 28, 35, 5 ,24 ,42};
    System.out.println("Result: " + findHigest(scores));
}
}