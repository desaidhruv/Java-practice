
// We use an Arraylist to store values without worrying about defining the size.
package Arrays;
import java.util.ArrayList;
public class Array_list {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        
        list.add("BMW");
        list.add("Audi");
        list.add("Mercedes");

        for (int i = 0; i < list.size(); i++) { //Displaying the contents
            System.out.println(list.get(i));
        }
    }
}