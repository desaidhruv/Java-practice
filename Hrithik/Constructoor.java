import java.util.*;

public class Constructoor {
    int x, y;

    void Constructoor (){
        x = 0;
        y = 0;
    }
    void accept(){
        Scanner sc = new Scanner(System.in);
        x = sc.nextInt();
        y = sc.nextInt();
        sc.close();
    }
    void show(){
        System.out.println("The value of x is " + x + " and y is " + y);
    }
    public static class Demo{
        public static void main(String[] args) {
            Constructoor c1 = new Constructoor();
            c1.accept();
            c1.show();

            Constructoor c2 = new Constructoor();
            c2.show();
        }
    } 
}