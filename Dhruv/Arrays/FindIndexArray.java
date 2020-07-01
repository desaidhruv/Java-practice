package Arrays;
import java.util.*;
public class FindIndexArray {

    public static int  findIndex (int[] my_array, int t) {
        if (my_array == null) return -1;
        int len = my_array.length;
        int i = 0;
        while (i < len) {
            if (my_array[i] == t) return i;
            else i=i+1;
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number for which you want to find the index:");
        int index = s.nextInt();
        System.out.println("Enter the size of an array:");
        int size = s.nextInt();
        System.out.println("Enter the array elements:");
        int[] my_array = new int[size];
        for (int i = 0; i < my_array.length; i++) {
            my_array[i] = s.nextInt();
        }
        s.close();
        System.out.println("Index position of "+index+ " is: " + findIndex(my_array, index));
    }
}