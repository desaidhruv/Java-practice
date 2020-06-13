import java.util.*;
public class Calculator {
    public static void main(String[] args) {
        int a,b,n,ans;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the value of a:");
        a = s.nextInt();
        System.out.println("Enter the value of b:");
        b = s.nextInt();
        System.out.println("Enter your choice: \n 1. Add \n 2. Subtract \n 3. Multiply \n 4. Divide \n 5. Exit");
        n = s.nextInt();
        s.close();
        switch (n) {
            case 1: ans = a+b;
                System.out.println("The addition of " + a + " and " + b + " is " + ans);
                break;
            case 2: ans = a-b;
                System.out.println("The subtraction of " + a + " and " + b + " is " + ans);
                break;
            case 3: ans = a*b;
                System.out.println("The multiplication of " + a + " and " + b + " is " + ans);
                break;
            case 4: ans = a/b;
                System.out.println("The division of " + a + " and " + b + " is " + ans);
                break;
            case 5:
                System.out.println("Thanks for using the calculator.");
                break;
            default:
                break;
        }

    }
}