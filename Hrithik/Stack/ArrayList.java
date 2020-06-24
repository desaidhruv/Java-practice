package Stack.HackerRank;
import java.util.*;
import java.io.*;



public class ArrayList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<ArrayList<Integer>> mainlist = new ArrayList<ArrayList<Integer>>();
        // Asking for number of lists to be entered
        for(int i =0; i < n; i++) {
            ArrayList<Integer> list = new ArrayList<Integer>(); // MainList where we add several List
            int x = sc.nextInt();
            // Asking user to enter elements into the list
            for(int j =1; j<=x; j++) {
                
                list[i].add(sc.nextInt());
            }
            mainlist.add(list);// Adding every small list into the main list 
        }
        int q = sc.nextInt();// here are taking inputs for the queries
        for(int k=0; k<q; k++){
            int x = sc.nextInt();
            int y = sc.nextInt();
            try {
                System.out.println(mainlist.get(x-1).get(y-1));
            } catch (Exception e) {
                System.out.println("ERROR!");
            }
        }
    }
}
