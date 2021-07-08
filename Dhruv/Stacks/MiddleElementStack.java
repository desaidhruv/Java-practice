package Stacks;
import java.util.*;

public class MiddleElementStack {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<Integer>();
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);
        stack.push(50);
        System.out.println(stack.size());
        int middle = stack.size() / 2;
        System.out.println(stack.elementAt(middle));
    }
}
