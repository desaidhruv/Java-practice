package SheetQuestions.Strings;

public class ValidShuffle {
    static void isValidShift (String str1, String str2, String res) {
        int len1 = str1.length();
        int len2 = str2.length();
        int resultLen = res.length();
        if(len1 + len2 != resultLen) {
            System.out.print("NOOO");
        }
        else {
            int i=0,j=0,k=0;
            int flag=0;
            while(k < resultLen) {
                if((i < len1) && str1.charAt(i) == res.charAt(k)) i++;
                else if((j < len2) && str2.charAt(j) == res.charAt(k)) j++;
                else {
                    flag = 1;
                    break;
                }
                k++;
            }
            System.out.print((i < len1 || j < len2)? "NOO" : "YESS");
        }
    }
    public static void main(String[] args) {
        String str1 = "XY";
        String str2 = "12";
        String res = "1X2Y";
        isValidShift(str1,str2,res);
    }
}
