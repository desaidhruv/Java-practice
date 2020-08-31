package LinkedList;

public class DoublyInsert {
    private Node head;
    private Node tail;
    private int length;

    public class Node {
        int data;
        Node previous;
        Node next;
        public Node(int data) {
            this.data = data;
        }
    }
    public DoublyInsert(){
        this.head = null; // When node is created, head and tail are null.
        this.tail = null;
        this.length = 0;
    }
    public boolean isEmpty() {
        return length == 0;
    }
    public int length() {
        return length;
    }
    public void insertAtLast(int value) {
        Node newNode = new Node(value);
        if(isEmpty()){
            head = newNode; // When inserting at last, head points to newNode 
        } else {
            tail.next = newNode;
            newNode.previous = tail;
        }
        tail = newNode;
        length++;
    }
    public void insertAtStart(int value) {
        Node newNode = new Node(value);
        if(isEmpty()){
            tail = newNode; // When inserting at beginning, head points to newNode
        } else {
            head.previous = newNode;
        }
        newNode.next = head; // To connect the newNode with existing Node.
        head = newNode;
        length++;
    }
    public void printDoubly(){
        if(head == null){
            return;
        }
        Node temp = head;
        System.out.print("The Doubly Linked List is: ");
        while(temp != null){
            System.out.print(temp.data+ " --> ");
            temp = temp.next;
        }
        System.out.print("null");
        System.out.println();
        System.out.println("The length of the Linked List is: " +length);
    }
    public static void main(String[] args) {
        DoublyInsert dll = new DoublyInsert();
        dll.insertAtLast(5);
        dll.insertAtLast(15);
        dll.insertAtLast(25);
        dll.insertAtLast(35);
        dll.insertAtStart(1);
        dll.printDoubly();
    }
}