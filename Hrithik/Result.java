import java.util.*;

public class Result {
    static void result(int n) {
        if (n > 75) {
            System.out.println("Distinction");
        } else if (n > 60 || n < 75) {
            System.out.println("First class");
        } else if (n > 40 || n < 50) {
            System.out.println("Second class");
        } else {
            System.out.println("Failed");
        }
    }

    public static void main(String[] args) {
        int marks;
        System.out.println("Enter marks of the student");
        Scanner sc = new Scanner(System.in);
        marks = sc.nextInt();
        sc.close();
        result(marks);
    }
}