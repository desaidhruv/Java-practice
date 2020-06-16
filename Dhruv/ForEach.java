import java.util.*;
public class ForEach {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("Happy");
        list.add("Birthday");
        list.add("To");
        list.add("You");
        for(String lis: list){
            System.out.println(lis);
        }
    }
}