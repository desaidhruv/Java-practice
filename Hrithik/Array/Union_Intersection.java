
import java.util.Scanner;
import java.util.ArrayList;


public class Union_Intersection {

    public void intersection(int[] x, int[] y) {
        ArrayList<Integer> l1 = new ArrayList<Integer>();
        for(int i=0; i<x.length; i++){
            for(int j=0; j<y.length; j++){
                if(x[i]==y[j]){
                    l1.add(x[i]);
                    continue;
                }
            }
        }
        for(int k : l1){
            System.out.print(k + " ");
        }
    }
    public void union(int[] x, int[] y) {
        ArrayList<Integer> r1 = new ArrayList<Integer>();

        for(int i = 0; i < x.length; i++)
            r1.add(x[i]); 

        for(int j=0; j < y.length; j++)
            r1.add(y[j]);
            
        for(int k : r1){
            System.out.print(k + " ");
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();
        int b = sc.nextInt();
        int[] a1 = new int[a];
        int[] b1 = new int[b];
        for(int i= 0; i < a1.length; i++){
            a1[i] = sc.nextInt();
        }
        for(int j=0; j< b1.length; j++){
            b1[j] = sc.nextInt();
        }
        sc.close();
        Union_Intersection obj = new Union_Intersection();
        System.out.println("Union of an array: ");
        obj.union(a1, b1);
        System.out.println();
        System.out.println("Intersection of array: ");
        obj.intersection(a1, b1);
        
    }
    
}