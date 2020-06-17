import java.util.ArrayList;
public class Foreach {
    public static void main(String[] args) {
        ArrayList<String> items =  new ArrayList<String>();
        items.add("Butter");
        items.add("Cheese");
        items.add("Bread");
        items.add("Noodles");
        for(String x : items) {
            System.out.println(x);
        }
    }
}