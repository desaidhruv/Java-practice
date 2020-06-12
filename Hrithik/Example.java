import java.util.*;

public class Example {
        int no;
        float bal;

        public void accept() {
            final Scanner sc = new Scanner(System.in);
            System.out.println("Enter account number and balance");
            no = sc.nextInt();
            bal = sc.nextFloat();
            sc.close();
        }

        public void result() {
            if (bal > 5000) {
                System.out.println("Account number: " + no);
                System.out.println("Balance in the account is: " + bal);
            }
        }

        public static class Demo {
            public static void main(final String[] args) {
                final Example E[] = new Example[2];
        for (int i = 0; i < 2; i++) {
            E[i] = new Example();
        }
        System.out.println("Enter details of the Account holder");
        for(int i = 0; i < 2; i++){
            E[i].accept();
        }
        System.out.println("Details of the Account holder");
        for(int i = 0; i < 2; i++){
            E[i].result();
        }
        }
    }
}
