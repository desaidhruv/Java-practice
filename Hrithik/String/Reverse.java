import java.util.*;

/**
 * Reverse in place
 */
public class Reverse {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Enter a string");

    String name = sc.nextLine(); 

    StringBuilder sb = new StringBuilder();
    sb.append(name);
    System.out.println(sb.reverse());

    sc.close();
    }
}