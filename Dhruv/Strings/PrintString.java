// Methods to use in String class:
/* 
1. char charAt(int index)
2. int length()
3. String substring(int begIndex)
4. String substring(int begIndex, int endIndex)
5. boolean contains(CharSequence s)
6. boolean equals(Object obj)
7. boolean isEmpty()
8. String concat(String str)
9. String replace(char old, char new)
10. String[] split(String regex)
*/

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