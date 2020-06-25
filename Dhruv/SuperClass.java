class A{
    public A(){
        System.out.println("in A");
    }
    public A(int i){
        System.out.println("in A int");
    }
}
class B extends A{
    public B(){
        System.out.println("in B");
    }
    
    public B(int i){
        super(i); //Super keyword is already present by default but it calls the default constructor everytime. So we can pass an arg to super keyword.
        System.out.println("in B int");
    }
}

public class SuperClass {
    public static void main(String[] args) {
        B obj = new B(5);

    }    
}