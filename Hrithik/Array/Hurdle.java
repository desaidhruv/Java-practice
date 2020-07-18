public class Hurdle{
    public static void main(String[] args) {
        int height[] = {1,6,3,5,2};
        int k = 4;

        int dose = 0;
        int max = height[0];

        for (int i = 0; i < height.length; i++) {
            if(height[i] > max){
                max = height[i];
            }
        }
        if(max > k){
            dose = max - k;
        }
        System.out.println(dose);
    }
}