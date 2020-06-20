import java.util.*;
public class Recursion {
    public static void table(int n, int count){
        if(count<=10){
            System.out.println(n + "X" + count + "=" + n*count);
            table(n,++count);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number whos table you want print:");
        int n = sc.nextInt();
        sc.close();
        table(n,1);
    }
}