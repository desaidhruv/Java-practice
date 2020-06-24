// Static Keyword: If you don't want the variable to be object specific then you can simply make it as a static variable.
// When we assign a variable as static then it goes into the class loader memory.
// When we know that the variable ceo is common for all the objects, then we can simply use a class name. i.e. Emp.ceo in this eg.
// To access a static variable, we don't need an object. That is the reason our main method(PSVM) don't need an object.
// We don't need to assign values for static variables in the constructor because constructor is called for every object.
// We can create the static block that will execute only once.
// 
class Emp{
    int emp_id;
    int salary;
    static String ceo;
    static{         // executed when you load a class.
        ceo= "Larry Page";
    }
    public Emp(){   // when you create an object.
        emp_id= 1;
        salary = 3000;
    }
    public void show(){
        System.out.println(emp_id + " : "+ salary + " : " + ceo);
    }
}
public class StaticDemo {
    public static void main(String[] args) {
        Emp Dhruv = new Emp();
        Dhruv.emp_id = 17;
        Dhruv.salary = 4000;
        Emp Rahul = new Emp();
        Rahul.emp_id = 18;
        Rahul.salary = 3000;
        Dhruv.show();
        Rahul.show();
    }    
}