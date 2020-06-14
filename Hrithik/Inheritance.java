import java.util.*;

public class Inheritance {
    String name, address;

    void accept(){
        Scanner sc = new Scanner(System.in);
        name = sc.nextLine();
        address = sc.nextLine();
    }

    void show() {
        System.out.println("Name of the branch: " + name);
        System.out.println("Address of the branch: " + address);
    }

    public static class Account extends Inheritance {
        int id, balance;

        void enter() {
            Scanner sc = new Scanner(System.in);
            id = sc.nextInt();
            balance = sc.nextInt();
            sc.close();
        }

        void display() {
            System.out.println("Account id: " + id);
            System.out.println("Balance: " + balance);
        }
    }
    public static class Demo {
        public static void main(String[] args) {
            Account a1 = new Account();
                a1.accept();
                a1.enter();
                a1.show();
                a1.display();
            }
        }
    }

