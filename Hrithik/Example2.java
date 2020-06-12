import java.util.*;

public class Example2 {
    String name;
    String designation;
    Float salary;

    void accept() {
        Scanner sc = new Scanner(System.in);
        name = sc.nextLine();
        designation = sc.nextLine();
        salary = sc.nextFloat();
        sc.close();
    }
    void show(){
        String p = "HOD || Head of the department";
        if( p.equals(designation)){
        System.out.println("Name: " + name);
        System.out.println("Designation: " + designation);
        System.out.println("Salary: "+ salary);
        }
    }
        public static class Demo {
            public static void main(final String[] args) {

                Example2 E[] = new Example2[3];
                for(int i = 0; i < 3; i++){
                    E[i] = new Example2();
                }
                System.out.println("Enter details of the faculty");
                for(int i= 0; i < 3; i++){
                    E[i].accept();
                }
                System.out.println("Details of Faculty");
                for(int i= 0; i < 3; i++){
                    E[i].show();
                }
            }
        }
    }

