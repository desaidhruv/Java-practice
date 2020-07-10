package Strings;
import java.util.*;
public class PrintString {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = s.nextLine();
        System.out.println("Welcome to Java: " + name);
        s.close();
    }
}