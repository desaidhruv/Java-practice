
public class Valid_shuffle {
    public static boolean Interleaved(String A, String B, String C){

        // Intervealed String is the combination of two strings such as String C is a cobination of String A and B. 
        int i =0;
        int j =0;
        int k =0;

        // Iterate through all the characters of C
        while(k != C.length()){

        // Check if the 1st letter if C matches with A || B if match then increment A
        if(i < A.length() && A.charAt(i) == C.charAt(k))
            i++;

        //  Check if the 1st letter if C matches with A || B if match then increment B
        else if(j < B.length() && B.charAt(j) == C.charAt(k))
            j++;

        else 
            return false;
            k++;
    }
    if(A.length() < B.length()){
        return false;
    }
    return true;
}
    public static void main(String[] args) {
        String A="ABC";
        String B="DEF";
        String C="ABCDEF";

        if(Interleaved(A, B, C) == true){
            System.out.println("It is intervealed");
        } else {
            System.out.println("It is not intervealed");
        }
    }
}