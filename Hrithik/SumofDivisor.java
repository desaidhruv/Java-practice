import java.util.*;

public class SumofDivisor {
    public static void main(String[] args){
        System.out.println("Enter number whose sum you want");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int j = 0;
        sc.close();
        for (int i =1; i <= number; i++){
            if(number%i == 0){
                j = j + i;
            }
        }
        System.out.println("Sum of divisors:" + j);
    }
}