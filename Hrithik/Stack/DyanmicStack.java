package Stack;

public class DyanmicStack {
    int capacity = 2; //Initialize the Stack with some size.
    int stack[] = new int[capacity];
    int top = 0;

    public void push(int data){
        if(size()==capacity)
            expand();// to incerease the size dynamically

        stack[top] = data;
        top++;
    }

    private void expand() {
        int length = size();
        int newStack[] = new int[length * 2];// here the size of stack is incereased in the multiples of 2
        System.arraycopy(stack, 0, newStack, 0,length);// here the data of the old stack is copied to new stack
        stack = newStack;
        capacity *= 2;
    }

    public int pop() {
        int data = 0;  
        if(isEmpty()){
            System.out.println("Stack empty");
        } else {
            top--;
            data = stack[top];
            stack[top] = 0;
            shrink();// to shrink the size of stack dynamically
        }
        return data;
    }

    private void shrink() {
        int length = size();
        /* 
        The if statment calculates that if the size of array goes below 3/4,
        then it shrinks it to give half of the size of array current array.
        For example:
        if the size of array is 4;
        after performing pop() opertation if out of 4 element 3 are poped,
        then the size of array will shrink to 4/2 = 2. 
        */
        if(length <= (capacity/2)/2)
            capacity = capacity/2;
        
        int newStack[] = new int[capacity];
        System.arraycopy(stack, 0, newStack, 0,length);//Again the data of older stack is copied to the newer stack
        stack = newStack;
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
            DyanmicStack D2 = new DyanmicStack();
            // This is just to see how size of array/stack is changed when we call pop() method
            D2.push(25);
            D2.push(45);
            D2.push(86);
            D2.push(74);
            D2.push(92);
            D2.show();

            D2.pop();
            D2.show();

            D2.pop();
            D2.show();

            D2.pop();
            D2.show();

            D2.pop();
            D2.show();
        }
    }
}