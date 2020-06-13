import java.util.*;


public class Overloadconst {
    float l,b, area, r;

    Overloadconst(float x, float y){
        l = x;
        b = y;
    }
    Overloadconst(float a){
        r = a;
    }
    void circle(){
        area = 3.14f * r * r;
        System.out.println("area of circle " + area);
    }
    void rect(){
        area = l * b;
        System.out.println("area of rectangle " + area);
    }
    public static class Demo {
        public static void main(String[] args) {
            Overloadconst area1 = new Overloadconst(4.57f);
            Overloadconst area2 = new Overloadconst(7,9);
            area1.circle();
            area2.rect();

        }
    }
}
