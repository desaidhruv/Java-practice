
public class Find_all_permutations {

    public static  void generatePermutations(String s, int start, int end) {
        if(start == end-1){
            System.out.println(s);
        } else {
            for(int i = start; i < end; i++) {
                // Swap the string by fixing the character
                s = swapString(s, start, i);
                // Recursively calling the generatePermutations() method for rest of characters
                generatePermutations(s, start+1, end);
                // Backtracking and swapping again
                s = swapString(s, start, i);
            }

        }
    }
    public static  String swapString(String str , int x, int y) {
        char[] b = str.toCharArray();
        char temp;
        temp = b[x];
        b[x] = b[y];
        b[y] = temp;
        return String.valueOf(b);
    }
    public static void main(String[] args) {
        String str = "123";
        int len = str.length();
        System.out.println("All the permutations are:");
        generatePermutations(str, 0 , len);

    }
}

