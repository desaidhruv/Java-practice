package Stack.HackerRank;
import java.util.AbstractList;
import java.util.Scanner;
import java.util.*;



public class ArrayList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList[] list = new ArrayList[20002];
        int n = sc.nextInt();

        for(int i =0; i < n; i++) {
            list[i] = new ArrayList();
            int x = sc.nextInt();

            for(int j = 0; j<=x;j++) {
                int val = sc.nextInt();
                list[i].add(val);
            }
        }
        int q = sc.nextInt();
        for(int k = 1; k <= q;k++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            try {
                System.out.println(list[x].get(y-1));
            } catch (Exception e) {
                System.out.println("ERROR!");
            }
        }
        sc.close();
    }
}