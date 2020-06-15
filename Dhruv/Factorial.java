import java.util.*;
public class Factorial {
    public static void main(String[] args) {
        int fact = 1;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number:");
        int num = s.nextInt();
        s.close();
        for (int i = 1; i <= num; i++) {
            fact = fact * i;
        }
        System.out.println("The Factorial of "+ num +" is "+ fact);
    }
}