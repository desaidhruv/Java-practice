package LinkedList;

public class LinkedList_insert {
    Node head; // Head of the list
    static class Node{
        int data;
        Node next;
        Node(int d){
            data = d;
            next = null;
        }
    }
    public void insertAtStart(int data){
        Node newData = new Node(data);
        newData.next = head;
        head = newData;
        
    }
    public void insertAtPos(int data, Node index){
        if( index == null ){
            System.out.println("The given previous node cannot be null.");
        }
        Node newData = new Node(data);
        newData.next = index.next;
        index.next = newData;
    }
    public void insert(int data){
        Node new_node = new Node(data);
        new_node.next = null;

        if(head == null){
             // Create new head node if no node present
            head = new_node;
        } else {
            // Traverse through the list if not null 
            Node n = head;  
            while(n.next != null){
                n = n.next;
            }
            // If n.next == null, we add new node at the end.
            n.next = new_node;
        }
    }
    public void printLength(){
        Node n = head;
        // Node end = new Node(data);
        int count = 1;
        while(n.next != null){
            n = n.next;
            count++;            
        }
        System.out.println(count);
    }
    public void display(){
        Node n = head;
        while(n != null){
            System.out.print(n.data+ " ");
            n = n.next;
        }
    }
    public static void main(String[] args) {
        LinkedList_insert list = new LinkedList_insert();
        list.head = new Node(5);
        Node n2 = new Node(18);
        Node n3 = new Node(81);
        Node n4 = new Node(83);
        list.head.next = n2;
        n2.next = n3;
        n3.next = n4;
        list.insert(35);
        list.insertAtStart(50);
        list.insertAtPos(55,n3.next);
        list.printLength();
        list.display();
    }    
}