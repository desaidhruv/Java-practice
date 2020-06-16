
public class MethodOverRiding {
    int result = 0;
    void add() {
        result = 50 + 50;
        System.out.println("RESULT OF ADDITION:" + result);
    }
    public static class B extends MethodOverRiding {
        int result = 0;
        public void add() {
            result = 50 + 50 + 50 ;
            System.out.println("RESULT OF ADDITION: " + result);
        }
    }
    public static class Demo {
        public static void main(String[] args) {
        B b1 = new B();
        b1.add();
        }
    }
}