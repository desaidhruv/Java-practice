import java.util.*;
public class EvenOdd {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number you want to check:");
        int num = s.nextInt();
        if(num % 2 == 0){
            System.out.println("The number "+ num +" is even number.");
        }
        else{
            System.out.println("The number "+ num +" is odd number.");
        }
        s.close();
    }
}