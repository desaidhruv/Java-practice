/**
 * HelloDemo
 */
import java.util.*;
class HelloDemo {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter your Name:");
        String name = s.nextLine();
        System.out.println("Hey, "+ name + " let's get started with Java Programming.");
        s.close();
    }
    
}