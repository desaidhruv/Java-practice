package Stack;
import java.util.*;

public class Reverse{
    //Function to generate reverse of the String using string and char array.
    public static String String_reverse(String name) {

        //Base check: if stack is empty or not.
        if(name == null || name.equals("")){
            return name;
        }
        // Create an empty stack.
        Stack<Character> str = new Stack<Character>();
        
        // push every character into the stack using toCharArray() method
        char[] ch = name.toCharArray();
        for(int i = 0; i < name.length(); i++){
            str.push(ch[i]);
        }
        // start/Initialize index at 0th position of
        int index = 0;

        //pop character from the stack until empty
        while(!str.isEmpty()){
            //Enter popped out character into the character array ch[] starting with the index 0 
            ch[index++]= str.pop();
        }
        //Convert the character array into string and return
        return String.copyValueOf(ch);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String name = sc.nextLine();
        sc.close();
        String result = String_reverse(name);
        System.out.println("Reversed String: "+ result);
    }
}