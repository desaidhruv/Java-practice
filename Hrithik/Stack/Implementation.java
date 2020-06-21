package Stack;

public class Implementation {
    int stack[] = new int[5];
    int top = 0;

    public void push(int data){
        stack[top] = data;
        top++;
    }

    public int pop(){
        int data;  
        top--;
        data = stack[top];
        stack[top] = 0;
        return data;
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
    }
    public static class Demo{
        public static void main(String[] args) {
            Implementation num = new Implementation();
            num.push(10);
            num.push(24);

            System.out.println(num.peek());

            num.push(56);

            System.out.println(num.pop());

            num.show();
        }
    }
}