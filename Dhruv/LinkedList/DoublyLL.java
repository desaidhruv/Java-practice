package LinkedList;

public class DoublyLL {
    private Node head;
    private Node tail;
    private int length;

    public class Node{
        int data;
        Node previous;
        Node next;

        public Node(int data){
            this.data = data;
        }
    }
    public DoublyLL() {
        this.head = null;
        this.tail = null;
        this.length = 0;
    }
    public boolean isEmpty(){
        return length == 0; // head == null
    }
    public int length(){
        return length;
    }
    public void printDoubly() {
        if(head == null) {
            return;
        }
        Node temp = head;
        System.out.print("The Doubly Linked List is: ");
        while (temp != null) {
            System.out.print(temp.data + " --> ");
            temp = temp.next;
        }
        System.out.print("null");
        System.out.println();
    }
    public void printReverse() {
        if(tail == null) {
            return;
        }
        Node temp = tail;
        System.out.print("The Reverse Doubly Linked List is: ");
        while (temp != null) {
            System.out.print(temp.data + " --> ");
            temp = temp.previous;
        }
        System.out.print("null");
    }
    public void insertAtLast(int value) {
        Node newNode = new Node(value); // New Node created at last
        if(isEmpty()) { // Check if list is empty or not.
            head = newNode;
        } else {
            tail.next = newNode;
        }
        newNode.previous = tail;
        tail = newNode;
        length++; // Tracking the number of items in the list.
    }
    public static void main(String[] args) {
        DoublyLL dll = new DoublyLL();
        dll.insertAtLast(10);
        dll.insertAtLast(20);
        dll.insertAtLast(30);
        dll.insertAtLast(40);
        dll.printDoubly();
        dll.printReverse();
    }
}