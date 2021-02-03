package SheetQuestions.Arrays;

public class MinNoJumps {
    static int getMin(int arr[],int n) {
        int step = arr[0],maxReach = arr[0], jump = 1;
        if(n == 1) {
            return 0;
        }
        else if(arr[0] == 0) {
            return -1;
        }
        else{
            for(int i = 1; i < n; i++) {
                if(i == n-1) {
                    return jump;
                }
                maxReach = Math.max(maxReach, i +arr[i]);
                step --;
                if(step == 0) {
                    jump++;
                    if(i >= maxReach) {
                        return -1;
                    }
                    step = maxReach - i;
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {1,3,5,8,9,2,6,7,6,8,9};
        int n = arr.length;
        System.out.println("The minimum number of jumps is: "+getMin(arr,n));
    }
}
