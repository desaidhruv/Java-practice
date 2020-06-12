import java.util.*;

public class FindPercentage {
    public static void main(String[] args) {
        int English, Maths, Hindi, Science;
        System.out.println("Enter marks for the subjects");
        Scanner sc = new Scanner(System.in);
        English = sc.nextInt();
        Maths = sc.nextInt();
        Hindi = sc.nextInt();
        Science = sc.nextInt();
        sc.close();
        int Total = Maths + English + Hindi + Science;
        float percent = Total/400;
        System.out.println("Percentage of the student is " + percent);
    }
}