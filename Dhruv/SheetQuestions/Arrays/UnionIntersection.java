package SheetQuestions.Arrays;
import java.util.*;
public class UnionIntersection {
    static void Union(int arr1[],int arr2[]) {
        HashSet<Integer> union = new HashSet<Integer>();
        for(int i = 0; i < arr1.length; i++)
            union.add(arr1[i]);
        for(int i = 0; i < arr2.length; i++)
            union.add(arr2[i]);
        // System.out.println(union);
    }

    static void Intersection(int arr1[],int arr2[]) {
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
        System.out.println("Enter the size of the array1: ");
        int n = sc.nextInt();
        int[] arr1 = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter array1 elements: ");
            arr1[i] = sc.nextInt();
        }
        System.out.println("Enter the size of the array2: ");
        int m = sc.nextInt();
        int[] arr2 = new int[n];
        for (int i = 0; i < m; i++) {
            System.out.println("Enter array2 elements: ");
            arr2[i] = sc.nextInt();
        }
        Union(arr1,arr2);
        Intersection(arr1,arr2);
        sc.close();
    }
}
