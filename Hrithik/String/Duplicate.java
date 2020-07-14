import java.util.Scanner;

public class Duplicate {
    public static void  FindDuplicate(String s) {
        
        char[] x = s.toCharArray();
        for (int i = 0; i < s.length(); i++) {
            for(int j = i+1; j < s.length(); j++) {
                if(x[i] == x[j]){
                    System.out.println(x[j]);
                    break;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String: ");
        String name = sc.nextLine();
        FindDuplicate(name);
        sc.close();
    }
}