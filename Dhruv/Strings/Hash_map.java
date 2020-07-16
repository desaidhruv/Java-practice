package Strings;
import java.util.*;
public class Hash_map {
    public static void main(String[] args) {
        // HashMap<String, Integer> map = new HashMap<>();
        // map.put("Dhruv", 20);
        // map.put("Desai", 60);
        // map.put("Phoenix", 30);
        // System.out.println(map);
        HashMap <Integer,String> hmap = new HashMap<Integer,String>();
        Scanner in = new Scanner(System.in);

        for(int i=0;i<3;i++){

            Integer a=in.nextInt();
            String b=in.next();

            hmap.put(a,b);
        }

        for(Map.Entry m:hmap.entrySet()) {    
            System.out.println(m.getKey()+" "+m.getValue());    
        }  
        in.close();
    }
}