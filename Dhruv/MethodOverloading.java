class Casio{
    public void add(int i, int j){
        System.out.println(i+j);
    }
    public void add(int i, int j, int k){
        System.out.println(i+j+k);
    }
    public void add(int i, double j){
        System.out.println(i+j);
    }
}

public class MethodOverloading {
    public static void main(String[] args) {
        Casio obj = new Casio();
        obj.add(4,5);
        obj.add(4,5.8);
        obj.add(4,5,7);
    }
}