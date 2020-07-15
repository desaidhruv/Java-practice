//This is not an optimised solution, the time complexity is O(n^2)
package Strings;
import java.util.*;
public class Anagrams_v1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String s1 = sc.next();
        boolean isAnagram = false;
        boolean visited[] = new boolean[s1.length()];
        sc.close();
        if(s.length() == s1.length()){
            for (int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);
                isAnagram = false;
                for (int j = 0; j < s1.length(); j++) {
                    if(s1.charAt(j) == c && !visited[j]) {
                        visited[j] = true;
                        isAnagram = true;
                        break;
                    }
                    
                }
                if(!isAnagram){
                    break;
                }
            }
        }
        if(isAnagram){
            System.out.println("Anagram");
        }
        else{
            System.out.println("Not anagram");
        }
    }
}