import java.util.*;

public class Forloop {
    public static void main(String[] args) {
        int i, n=0;
        for (i = 2; i < 10; i=i+2){
            n = i * i;
        }
        System.out.println("Square of the numbers from 1 to 10" + n);
    }
}