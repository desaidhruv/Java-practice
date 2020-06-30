package Arrays;
public class ForEach2DArray {
    public static void main(String[] args) {
        int d[][] = {
                        {1, 2, 3, 4},
                        {11, 21, 31, 41},
                        {12, 22, 32, 42}
                    };
        for(int k[] : d) {
            for(int l : k){
                System.out.print(" " + l);
            }
            System.out.println();
        }
    }
}