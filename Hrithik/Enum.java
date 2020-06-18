public class Enum {
    enum Names {
        HRITHIK,
        SAKSHI,
        DHRUV
    }
    public static void main(String[] args) {
        for(Names item : Names.values()) {
            System.out.println(item);
        }
    }
}