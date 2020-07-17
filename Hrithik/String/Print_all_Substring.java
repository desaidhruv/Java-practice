import java.util.ArrayList;

/**
 * Print_all_Substring
 */
public class Print_all_Substring {
    public static ArrayList<String> list = new ArrayList<String>();

    public static void findsequence(String s , String ans){
        if(s.length() == 0){
            list.add(ans);
            return;
        }
        // Including first character 
        findsequence(s.substring(1),ans+s.charAt(0));

        // Excluding first character 
        findsequence(s.substring(1),ans);
    }
    public static void main(String[] args) {
        String str = "rutu";
        findsequence(str, "");
        System.out.println(list);
    }
}