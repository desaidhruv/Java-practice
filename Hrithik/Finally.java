public class Finally {
    public static void main(String[] args) {
        int n[] = new int[5];
        try {
            int a = n[5];
            System.out.println("Inside try block");

        } catch (NullPointerException e) {
            System.out.println("Inside catch block");
        } finally {
            System.out.println("Finally block executed");
        }
        System.out.println("Outside try-catch block");
    }
}