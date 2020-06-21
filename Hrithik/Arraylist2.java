import java.util.*;

public class Arraylist2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> items = new ArrayList<String> ();
        System.out.println("Enter how many elements you want to add");
        int n = sc.nextInt();
        for(int i = 0; i <= n; i++) {
            items.add(sc.nextLine());
        }
        sc.close();
        Collections.sort(items);
        for(String x: items) {
            System.out.println(x);
        }
        }
    }
    
