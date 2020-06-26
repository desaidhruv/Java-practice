public class ForEach2D {
    public static void main(String[] args) {
        int[][] array = { 
            {1,2,3,4,5},
            {2,5,1,3},
            {8,9,2,1,4}
        };
        for(int k[]:array){
            for(int x: k){
                System.out.print(" " + x);
            }
            System.out.println();
        }
    }
}