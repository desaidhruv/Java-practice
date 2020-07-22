package LinkedList;
public class LinkedList_print {
    Node head; // Head of the list

    // Linkded List Node
    static class Node {
        int data;
        Node next;
    // Constructor to create a new node 
    // Next is by default intitalized as null
        Node(int d) {
            data = d;
            next = null;
        }
    }
    public void printList(){
        Node n = head;
        while(n != null){
            System.out.print(n.data+ " ");
            n = n.next;
        }
    }
    public static void main(String[] args) {
        LinkedList_print list = new LinkedList_print();
        list.head = new Node(1); 
        Node n2 = new Node(10);
        Node n3 = new Node(20);
        Node n4 = new Node(40);
        list.head.next = n2;
        n2.next = n3;
        n3.next = n4;
        list.printList();
    }
    
}