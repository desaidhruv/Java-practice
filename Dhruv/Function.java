public class Function {
    public static void main(String[] args) {
        int a = add(5,6);
        display(a);
    }
    public static int add(int x, int y){
        int z = x+y;
        return z;
    }
    public static void display(int x){
        System.out.println(x);
    }
}