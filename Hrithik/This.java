public class This {
    int x= 20,y= 20;
    void function(int x, int y){
        this.x = x;
        this.y = y;
    }
    void show(){
        System.out.println("X: " + x +  " Y: " +y);
    }
    public static class Demo{
        public static void main( String[] args) {
            final This t1 = new This();
            t1.function(50,75);
            t1.show();
        }
    } 
    
}