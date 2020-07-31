package LinkedList;

public class Singly_insert {
    private Node head;
    private static class Node {
        private int data;
        private Node next;
        public Node (int data) {
            this.data = data;
            this.next = null;
        }
    }
    public Node insertAtStart (Node head,int data) {
        Node newNode = new Node(data);
        if(head == null) {
            return newNode;
        }
        newNode.next = head;
        head = newNode;
        return head;
    }
    public void insertAfter(Node previous, int data) {
        if(previous == null) {
            System.out.println("The previous Node cannot be empty.");
            return;
        }
        Node newNode = new Node(data);
        newNode.next = previous.next;
        previous.next = newNode;
    }
    public Node insertAtEnd (Node head,int data) {
        Node newNode = new Node(data);
        if(head == null) {
            return newNode;
        }
        Node current = head;
        while(null != current.next) {
            current = current.next;
        }
        current.next = newNode;
        return head;
    }
    public void display(Node head) {
        Node current = head;
        while (current != null) {
            System.out.print(current.data+ " --> ");
            current = current.next;
        }
        System.out.print(current);
    }
    public static void main(String[] args) {
        Node head = new Node(10);
        Node second = new Node(12);
        Node third = new Node(24);
        Node fourth = new Node(48);
        // Attach them
        head.next = second;
        second.next = third;
        third.next = fourth;
        Singly_insert list = new Singly_insert();
        list.display(head);
        Node newHead = list.insertAtStart(head,60); 
        Node newTail = list.insertAtEnd(head,72); 
        System.out.println();
        list.insertAfter(second, 84);
        list.display(newTail);
    }
}