public class Longest_Palindrome {
    public static String Check_Long_Palindrome(String s){

        if(s.isEmpty()){
            return "Enter a string";
        }

        if(s.length() == 1){
            return s;
        }

        String longest = s.substring(0, 1);
        for (int i = 0; i < s.length(); i = i+1) {
            
            String temp = checkEquality(s,i,i);
            if(temp.length() > longest.length()){
                longest = temp;
            }

            temp = checkEquality(s,i, i+1);
            if(temp.length() > longest.length()){
                longest = temp;
            }
        }
        return longest;
    }

    public static String checkEquality(String s, int begin, int end){
        while(begin >= 0 && end < s.length() - 1 && s.charAt(begin) == s.charAt(end)){
            begin--;
            end++;
        }
        return s.substring(begin + 1, end);
    }
    public static void main(String[] args) {
        String str = "racecar";
        System.out.println(Check_Long_Palindrome(str));
    }
}