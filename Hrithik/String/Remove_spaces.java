import java.util.*;

public class Remove_spaces {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String");
        String name = sc.nextLine();

                // This removes spaces from starting and ending of the String.
                // It does not remove spaces from the middle of the String.
        String result = name.trim();
        System.out.println("Result after trimming: " + result ); 

        // But to remove spaces from start end and middle we use replaceAll() method instead of trim() method
        String result2 = name.replaceAll("\\s", "");
        System.out.println("Result after replacing all spaces: " + result2);
        sc.close();
    }
}