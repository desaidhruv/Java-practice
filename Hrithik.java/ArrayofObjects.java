import java.util.*;

public class ArrayofObjects {
    String name;
    int roll;
    float perc;
    void accept(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name, roll, and prec of student");
        name = sc.nextLine();
        roll = sc.nextInt();
        perc = sc.nextFloat();
    }
    void show(){
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + roll);
        System.out.println("Percentage: " + perc);
    }
    
    public static class Demo {
        public static void main(String[] args) {
            ArrayofObjects A[] = new ArrayofObjects[5];
            for (int i = 0; i < 5; i++){
                A[i] = new ArrayofObjects();
            }
            System.out.println("Enter data of Students");
            for(int i = 0; i < 5; i++){
                A[i].accept();
            }
            System.out.println("Details of Students");
            for(int i = 0; i < 5; i++){
                A[i].show();
            }
        }
    }
    
} 