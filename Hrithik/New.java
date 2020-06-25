 import java.util.*;

 public class New {
     public static void main(String[] args) {
         Scanner sc  = new Scanner(System.in);
         int n = sc.nextInt();
         ArrayList<ArrayList<Integer>> lists = new ArrayList();

         for(int row = 0; row < n; row ++) {
             ArrayList<Integer> list = new ArrayList();
             int x = sc.nextInt();

             for(int col = 0; col < x; col++){
                 int val = sc.nextInt();
                 list.add(val);
             }
             lists.add(list);
         }
        
         int q = sc.nextInt();
         for(int k= 0; k < q; k++){
             int x = sc.nextInt();
             int y = sc.nextInt();
             ArrayList<Integer> list = lists.get(x-1);
             if(y <= list.size()) {
                 System.out.println(list.get(y-1));
             } else {
                 System.out.println("ERROR!");
             }
            
         }
     }
 }

