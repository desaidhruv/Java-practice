import java.util.*;

public class ThrowException {
    public static int result(int a, int b) throws Exception {
        if(a==0 || b==0){
            throw new Exception("a and b cannot be zero");
        } else if(a<0 || b<0){
            throw new Exception("a and b cannot be negative");
        } else {
            return a/b;
        }
    }
    public static class Demo {
        public static void main(String[] args) {
            int ans,x,y;
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter values for X and Y:");
            x = sc.nextInt();
            y = sc.nextInt();
            sc.close();
        try {
            ans = result(x, y);
            System.out.println("Result of the operation is " + ans);
        } catch (Exception e) {
            System.out.println(e);
        }
        }
    }
}