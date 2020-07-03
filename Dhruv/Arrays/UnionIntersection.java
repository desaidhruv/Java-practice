package Arrays;
import java.util.*;
public class UnionIntersection {
    static int printUnion(int arr1[], int arr2[], int m, int n) 
    { 
      int i = 0, j = 0; 
      while (i < m && j < n) 
      { 
        if (arr1[i] < arr2[j]) 
          System.out.print(arr1[i++]+" "); 
        else if (arr2[j] < arr1[i]) 
          System.out.print(arr2[j++]+" "); 
        else
        { 
          System.out.print(arr2[j++]+" "); 
          i++; 
        } 
      } 
       
      /* Print remaining elements of  
         the larger array */
      while(i < m) 
       System.out.print(arr1[i++]+" "); 
      while(j < n) 
       System.out.print(arr2[j++]+" "); 
         
      return 0;    
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number of elements in the first array:");
        int n = s.nextInt();
        System.out.println("Enter the array 1 elements:");
        int[] arr1 = new int[n];
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = s.nextInt();
        }
        System.out.println("Enter the number of elements in the second array:");
        int m = s.nextInt();
        System.out.println("Enter the array 2 elements:");
        int[] arr2 = new int[m];
        for (int i = 0; i < m; i++) {
            arr2[i] = s.nextInt();
        }
        s.close();
        printUnion(arr1, arr2, m, n);
        
    }
}