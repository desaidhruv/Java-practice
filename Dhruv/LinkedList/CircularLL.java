package LinkedList;

public class CircularLL {
    Node last;
    int length;
    static class Node { //Create Node.
        int data;
        Node next;
        Node(int d) {
            data = d;
        }
    }
    public CircularLL() {
        last = null;
        length = 0;
    }
    public int length() {
        return length;
    }
    public boolean isEmpty() {
        return length == 0;
    }
    public void createLL() {
        Node n1 = new Node(5);
        Node n2 = new Node(12);
        Node n3 = new Node(24);
        Node n4 = new Node(48);

        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n1;
        last = n4;
    }
    public void printList(){ // Print the CircularLL
        if(last == null) return;
        Node n1 = last.next;
        while(n1 != last){
            System.out.print(n1.data + " ");
            n1 = n1.next;
        }
        System.out.print(n1.data+" ");
    }
    
    public static void main(String[] args) {
        CircularLL list = new CircularLL();
        list.createLL();  
        list.printList();
    }
}