class Calculator1{      //Super class
    public int add(int i, int j){
        return i + j;
    }
}
class CalculatorAdv extends Calculator{     //Sub class
    public int sub(int i, int j){
        return i - j;
    }
}

public class InheritanceDemo {
    public static void main(String[] args) {
        Calculator1 c1 = new Calculator1();
        int result = c1.add(5,4);
        System.out.println(result);
        CalculatorAdv c2 = new CalculatorAdv();
        int result2 = c2.sub(6,3);
        System.out.println(result2);
    }    
}