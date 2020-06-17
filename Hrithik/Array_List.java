import java.util.ArrayList;

public class Array_List {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<String> ();
        names.add("Hanna");
        names.add("Justin");
        names.add("Thomas");
        names.add("Grace");

        for(int i = 0; i < names.size(); i++) {
            System.out.println(names.get(i));
        }
    }
}