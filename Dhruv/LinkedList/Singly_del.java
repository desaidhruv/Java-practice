package LinkedList;

public class Singly_del {
    Node head;
    private static class Node {
        private int data;
        private Node next;
        public Node(int data) { // Creating a node.
            this.data = data;
            this.next = null;
        }
    }
    public Node deleteLast(Node head) {
        if(head == null) { //Check whether Head is empty or not.
            return head;
        }
        Node last = head;
        Node previousToLast = null;
        while(last.next != null) {
            previousToLast = last;
            last = last.next;
        }
        previousToLast.next = null;
        return last;
    }
    public Node deleteAtPos(Node head,int position) {
        Node previous = head;
        int count = 1;
        while (count < position-1) {
            previous = previous.next;
            count++;
        }
        Node current = previous.next;
        previous.next = current.next;
        current.next = null;
        return current;
    }
    public Node deleteFirst(Node head) {
        if(head == null) {
            return head;
        }
        Node temp = head;
        head = head.next;
        temp.next = null;
        return temp;
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
        Node second = new Node(20);
        Node third = new Node(30);

        head.next = second;
        second.next = third;
        Singly_del list = new Singly_del();
        list.display(head);
        // Node first = list.deleteFirst(head);
        // Node lastNode = list.deleteLast(head);
        // System.out.print(lastNode.data);
        Node delNode = list.deleteAtPos(head, 2);
        System.out.println();
        System.out.println(delNode.data);
        // list.display(head);
    }
}