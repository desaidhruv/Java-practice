package Stack;
import java.util.*;

public class ArrayReverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string which you want to reverse");
        String name = sc.nextLine();
        sc.close();
        char[] x = name.toCharArray();
        System.out.println("Reversed string:");
        for(int i = x.length-1; i >= 0; i--){
            System.out.print(x[i]);
        }
    }
}