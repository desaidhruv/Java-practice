package Stack;

public class Implementation2 {
    int stack[] = new int[5];
    int top = 0;

    public void push(int data){

        if(top==5){
            System.out.println("Stack full");
        } else {
        stack[top] = data;
        top++;
        }
        
    }

    public int pop(){
        int data = 0;  
        if(isEmpty()){
            System.out.println("Stack empty");
        } else {
            top--;
            data = stack[top];
            stack[top] = 0;
        }
        return data;
        
    }
    public int size(){
        return top;
    }
    public boolean isEmpty(){
        return top<=0;
    }

    public int peek(){
        int data;
        data = stack[top-1];
        return data;
    }

    public void show(){
        for(int x : stack){
            System.out.println(x + " ");
        }
        System.out.println();
    }
    public static class Demo{
        public static void main(String[] args) {
            Implementation2 num = new Implementation2();
            System.out.println(num.pop());
            num.show();
        }
    }
}