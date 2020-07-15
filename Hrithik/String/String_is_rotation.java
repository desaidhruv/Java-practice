import java.util.*;

public class String_is_rotation {
    public static void CheckRotation(String str1, String str2){
        String temp = str1 + str2;
        if(str1.length() == str2.length() && temp.indexOf(str2) != -1){
            System.out.println("String is rotation");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter strings to compare");
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();

        CheckRotation(s1,s2);
        sc.close();
    }
}