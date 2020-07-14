import java.util.*;

public class CountOccurance {
    public static int findOccurance(String s, char a){
        int res = 0;

        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == a){
                res++;
            }
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        
        char a = 'h';

        System.out.println("Occurance : " + findOccurance(name, a));
        sc.close();
    }
}