package SheetQuestions.Strings;

public class areRotations {
    static String areRotation(String str1, String str2) {
        return ((str1+str1).contains(str2) ? 
                "Strings are rotations of each other." : 
                "Strings are not rotations of each other.");
    }
    public static void main(String[] args) {
        String str1 = "Desai";
        String str2 = "esaiD";
        System.out.print(areRotation(str1,str2));
    }
}
