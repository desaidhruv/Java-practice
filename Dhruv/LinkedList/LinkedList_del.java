package LinkedList;

public class LinkedList_del {
    Node head;
    static class Node{ //created Node
        int data;
        Node next;
        Node(int d){ // Node constructor
            data = d;
            next = null;
        }
    }
    public void delete(int pos){
        // If LinkedList is Empty
        if(head == null){
            System.out.print("List is Empty.");
            return;
        }
        Node n = head;
        // If head needs to be removed
        if (pos == 0) 
        { 
            head = n.next;   // Change head 
            System.out.print("The head is deleted.");
            System.out.println();
            return; 
        }
        // Find previous node of the node to be deleted 
        for (int i = 0; n!=null && i < pos-1; i++) {
            n = n.next;
        }
        // If position is more than number of nodes 
        if (n == null || n.next == null) 
            return;
        Node n1 = n.next.next;
        n.next = n1;  
        System.out.print("The element "+ n.data + " is deleted.");
    }
    public void display(){
        Node n = head;
        while(n!= null){// Print the Node
            System.out.print(n.data + " ");
            n = n.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        LinkedList_del list = new LinkedList_del();
        list.head = new Node(10);
        Node n2 = new Node(15);
        Node n3 = new Node(25);
        list.head.next = n2;
        n2.next = n3;
        list.display();
        list.delete(2);
        list.display();
    }
}