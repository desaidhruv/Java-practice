import java.util.*;

public class Dept {
    String name,college,Tname;

    void accept(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter details of the Department:");
        name = sc.nextLine();
        college = sc.nextLine();
        Tname = sc.nextLine();
    }
    void show(){
        System.out.println("Name of the Department:" + name);
        System.out.println("Name of the college:" +college);
        System.out.println("Name of the Teacher:" + Tname);
    }
    
    public static class Teacher extends Dept {
        String  Sub;

        void enter(){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter details of the teacher:");
            Sub = sc.nextLine();
            sc.close();
        } 
        void display(){
            if(Sub.equals("java")){
                System.out.println("Name of the Subject:" + Sub);
            }
            else {
                System.out.println("Name of the Subject: " + Sub);
            }
        }
        public static class Demo {
            public static void main(String[] args) {
                Teacher t1 = new Teacher();
                t1.accept();
                t1.enter();
                t1.show();
                t1.display();
            }
        }
    }
}