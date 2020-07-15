import java.util.*;

public class Remove_Duplicate{
    public static void remove_duplicate(String str){
        StringBuilder sb = new StringBuilder();
        Set<Character> HashSet = new HashSet<>();
        for (int i = 0; i < str.length(); i++) {
            HashSet.add(str.charAt(i));
        }
        
        for (Character c : HashSet) {
            sb.append(c);
        }
        System.out.println(sb);
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        remove_duplicate(s);
        sc.close();
    }
}