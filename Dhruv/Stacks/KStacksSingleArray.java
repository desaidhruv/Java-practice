package Stacks;
import java.util.*;

public class KStacksSingleArray {
    static void inputStack(Stack<Integer> stack) {
        System.out.print("Enter the Stack Element:");
        Scanner sc = new Scanner(System.in);
        
        for(int i = 0;i < 3;i++) {
            stack.push(sc.nextInt());
        }
    }
    static void inputArray(Stack<Integer> stack,Stack<Integer> stack1, int[] arr) {
        for(int i = 0; i < 3;i++) {
            arr[i] = stack.elementAt(i);
        }
        for(int i = 0; i < arr.length / 2;i++) {
            arr[i] = stack1.elementAt(i);
        }
        for(int i = 0; i < arr.length; i++){ // Displaying
            System.out.println(arr[i]);
        }
    }
    public static void main(String[] args) {
        int arr[] = new int[6];
        Stack<Integer> stack = new Stack<Integer>();
        Stack<Integer> stack1 = new Stack<Integer>();
        inputStack(stack);
        inputStack(stack1);
        // System.out.println(stack);
        // System.out.println(stack1);
        inputArray(stack, stack1, arr);
    }
}
