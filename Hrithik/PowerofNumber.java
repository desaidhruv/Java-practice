import java.math.*;
import java.util.*;

class PowerofNumber {
    public static int power(int n, int p) throws Exception {
        if (n == 0 && p == 0) {
            throw new Exception("n & p cannot be zero");
        } else if (n < 0 || p < 0) {
            throw new Exception("n & p cannot be negative");
        } else {
            return ((int) Math.pow(n, p));
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.close();
        try {
            System.out.println(power(a, b));
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    
}
