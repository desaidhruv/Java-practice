package SheetQuestions1.Arrays;
import java.util.*;

public class UnionIntersection {
    static void findUnion(int[] array1,int[] array2) {
        HashSet<Integer> result = new HashSet<Integer>();
        for(int i = 0;i < array1.length; i++) {
            result.add(array1[i]);
        }
        for(int i = 0;i < array2.length; i++) {
            result.add(array2[i]);
        }
        System.out.println(result.size());
    }
    static void findIntersection(int arr1[],int arr2[]) {
        HashSet<Integer> intersection = new HashSet<Integer>();
        for(int i=0; i < arr1.length; i++) {
            intersection.add(arr1[i]);
        }
        for(int i=0;i<arr2.length;i++) {
            if(intersection.contains(arr2[i])) {
                System.out.print(arr2[i]+ " ");
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of Array1:");
        int n = sc.nextInt();
        System.out.println("Enter the Array1 Elements:");
        int[] array1 = new int[n];
        for(int i = 0; i < n; i++) {
            array1[i] = sc.nextInt();
        }
        System.out.println("Enter the size of Array2:");
        int n2 = sc.nextInt();
        System.out.println("Enter the Array2 Elements:");
        int[] array2 = new int[n2];
        for(int i = 0; i < n2; i++) {
            array2[i] = sc.nextInt();
        }
        sc.close();
        findUnion(array1,array2);
        findIntersection(array1,array2);
    }
}
