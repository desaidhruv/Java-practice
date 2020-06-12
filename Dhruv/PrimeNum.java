import java.util.*;
public class PrimeNum {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number to check whether it is prime or not:");
        int num = s.nextInt();
        int flag = 0;
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                System.out.println("The number "+ num +" is not a prime number.");
                flag = 1;
                break;
            }
            
        }
        if(flag == 0){
            System.out.println("The number "+ num +" is a prime number.");
        }
        s.close();
    }
}