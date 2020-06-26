
class AddSum{
    public int add( int ... n){
        int sum = 0;
        for(int i: n){
            sum = sum+i;
        }
        return sum;
    }
}

public class VarArgs {
    public static void main(String[] args) {
        AddSum obj = new AddSum();
        System.out.println(obj.add(5,6,85));
    }
}