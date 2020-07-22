package LinkedList;

public class LinkedList_basic {
    Node head;
    static class Node{
        int data;
        Node next;
        Node(int d){
            data = d;
            next = null;
        }
    }
    public static void main(String[] args) {
        LinkedList_basic l = new LinkedList_basic();
        l.head = new Node(10);
        Node n2 = new Node(20);
        Node n3 = new Node(30);
        l.head.next = n2;
        n2.next = n3;

    }
}