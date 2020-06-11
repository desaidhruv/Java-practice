import java.util.*;
public class Fibonacci {
    public static void main(String[] args) {
        // 0 1 1 2 3 5 8 13 21
        int n1 = 0, n2 = 1, n3; //Initialize 0, 1
        int count;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the total number of Fibonacci series you want to print:"); // Input from user
        count = s.nextInt();
        System.out.print(n1 +" "+ n2); // Print 0 and 1
        for (int i = 2; i < count; i++) {  // loop begin from 2 because 0 and 1 already printed.
            n3 = n1 + n2;
            System.out.print(" "+n3);
            n1 = n2;
            n2 = n3;
        }
        s.close();
    }
}