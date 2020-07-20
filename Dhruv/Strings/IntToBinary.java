package Strings;
public class IntToBinary {
    public static void main(String[] args) {
        int j = 5;        
        String s=Integer.toBinaryString(j);;
        int op = 0;
         int count = 0;
         for(int i = 0;i<s.length();i++)
         {
             if(s.charAt(i) == '1')
             {
                 count++;
                 if(count > op)
                     op = count;
             }
             else
             {
                 count = 0;
             }
         }
         
         System.out.println(op);
    }
}