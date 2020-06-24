class Calc{
    int num1;
    int num2;
    int result;
    public Calc(int n, int m){
        num1 = n;
        num2 = m;

    }
    public void add(){
        result = num1 + num2;
    }
    public void sub(){
        result = num1 - num2;
    }
    public void multiply(){
        result = num1 * num2;
    }
    public void divide(){
        result = num1 / num2;
    }
}

public class ObjCalc {
    public static void main(String[] args) {
        Calc obj = new Calc(500,25);
        obj.add();
        System.out.println(obj.result);
        obj.sub();
        System.out.println(obj.result);
        obj.multiply();
        System.out.println(obj.result);
        obj.divide();   
        System.out.println(obj.result);
    }
}