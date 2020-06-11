import java.util.*;

public class calculator {
    public static void main(String[] args) {
        int a, b, ans, n;
        System.out.println("Enter values of a and b: ");
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        System.out.println("Enter your choice of operation: \n 1. Add \n 2. Sub \n 3. Mul \n 4. Div");
        n = sc.nextInt();
        switch (n) {
            case 1 : ans = a+b;
            System.out.println("The answer of addition is " + ans);
                break;
            case 2 : ans = a-b;
            System.out.println("The answer of subtraction is " + ans);
                break;
            case 3 : ans = a*b;
            System.out.println("The answer of multiplication is " + ans);
                break;
            case 4 : ans = a%b;
            System.out.println("The answer of division is " + ans);
                break;
            default:
            System.out.println("Enter valid choice of operation");
                break;
        }
    }
}