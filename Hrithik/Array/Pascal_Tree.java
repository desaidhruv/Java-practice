
public class Pascal_Tree{
    public static int ncr(int n, int r){
        return factorial(n) / (factorial(n-r) * factorial(r));
    }

    public static int factorial(int n){
        int f;
        for(f = 1; n > 1; n--){
            f *= n;
        }
        return f;
    }
    public static void main(String[] args) {
        
        int n = 5;

        for(int i = 0; i <= n; i++) {
            for(int j = 0; j <= n-i; j++){
                System.out.println(" ");
            }
            for(int j= 0; j <= i; j++){
                System.out.print(" " + ncr(i,j));
            } 
            System.out.println();
        }
    }
}