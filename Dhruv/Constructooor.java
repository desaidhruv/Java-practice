// Constructors are used to allocate the memory to the object created.
// Constructor is the member method i.e. will have brackets.
// They have the same name as the class name.
// It will never return anything.
// Also used to initialize the memory.
//When a constructor is created, only the memory is allocated.
class Calculate{
    int num1;
    int num2;
    int result;

    public Calculate(){
        System.out.println("This is the default constructor.");
        num1 = 8;
    }
    public Calculate(int n){
        System.out.println("This is the parameterized constructor");
        num1 = n;
    }
}


public class Constructooor {
    public static void main(String[] args) {
        Calculate obj1 = new Calculate(); // default Constructor
        System.out.println(obj1.num1);
        Calculate obj = new Calculate(5); // parameterized Constructor
        System.out.println(obj.num1);
    }
}