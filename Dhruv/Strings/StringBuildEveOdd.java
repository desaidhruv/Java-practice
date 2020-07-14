package Strings;
import java.util.*;
public class StringBuildEveOdd {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int testCases = scan.nextInt();
        for(int i = 0; i < testCases; i++){
            char[] inputString = scan.next().toCharArray();
            StringBuilder oddString = new StringBuilder();
            StringBuilder evenString = new StringBuilder();
   
            for(int j = 0; j < inputString.length; j++) {
                if( (j & 1) == 0) {
                    evenString.append(inputString[j]);
                }
                else {
                    oddString.append(inputString[j]);
                }
            }
            
            System.out.println(evenString + " " + oddString);
        }
        scan.close();
    }
}