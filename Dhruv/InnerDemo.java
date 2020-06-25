class Outer{
    int a;
    public void show(){

    }
    class Inner{
        public void display(){
            System.out.println("In display.");
        }
    }
}


public class InnerDemo {
    public static void main(String[] args) {
        Outer obj = new Outer();
        Outer.Inner obj1 = obj.new Inner();
        obj1.display();
    }    
}