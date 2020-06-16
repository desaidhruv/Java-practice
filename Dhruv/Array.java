import java.util.*;
public class Array {
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number of cars:");
        int n = s.nextInt();
        System.out.println("Enter the cars:");
        
        String[] cars = new String[n];
        for(int i = 0; i < cars.length; i++){ //Accepting input from the user
            System.out.println("Enter car # "+ (i+1));
            cars[i] = s.next();   
        }
        for(int i = 0; i < cars.length; i++){ // Displaying
            System.out.println("Spot # "+ (i+1) + " = " + cars[i] );
        }
    }
}