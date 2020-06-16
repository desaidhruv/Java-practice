

public class SuperKEY {
    int var;
    void show() {
        System.out.println("value of variable in parent class: " + var);
    }
    public static class B extends SuperKEY {
        int var;
        void display() {
            System.out.println("value of variable in child class:" + var);
        }
        void accept(final int x, final int y) {
            var = x;
            super.var = y;
        }
    }

    public static class Demo {
        public static void main(final String[] args) {
            B b1 = new B();
            b1.accept(10, 20);
            b1.show();
            b1.display();
        }
    }
}