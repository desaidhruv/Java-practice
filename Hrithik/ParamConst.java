import java.util.*;

public class ParamConst {
    int x,y;

    ParamConst(int p, int q){
        x = p;
        y = q;
    }
    void access(){
        Scanner sc = new Scanner(System.in);
        x = sc.nextInt();
        y = sc.nextInt();
        sc.close();
    }
    void show(){
        System.out.println("the value of x is " + x + " the value of y is " + y);
    }
    public static class Demo {
        public static void main(String[] args) {
        ParamConst a = new ParamConst(10,50);
        a.show();

        ParamConst b = new ParamConst(50,75);
        b.access();
        b.show();
        }
    }
}
