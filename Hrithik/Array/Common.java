import java.util.*;
public class Common {
    public static void Common_items(int[] a, int[] b, int[] c) {
        
        for(int i=0; i<a.length; i++){
            for(int j=0; j<b.length; j++){
                for(int k=0; k<c.length; k++){
                    if(a[i] == b[j] && b[j] == c[k]){
                        System.out.println("The common elements are: " + a[i] + " ");
                    }
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        int[] c = new int[n];
        System.out.println("Enter 1st array elements");
        for (int i=0; i < a.length; i++) {
            a[i] = sc.nextInt();
            // Arrays.sort(a);
        }
        System.out.println("Enter 2nd array elements");
        for (int i=0; i < b.length; i++) {
            b[i] = sc.nextInt();
            // Arrays.sort(b);
        }
        System.out.println("Enter 3rd array elements");
        for (int i=0; i < c.length; i++) {
            c[i] = sc.nextInt();
            // Arrays.sort(c);
        }
        Common_items(a,b,c);
        sc.close();
    }
}