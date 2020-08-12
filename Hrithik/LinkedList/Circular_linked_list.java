public class Circular_linked_list {
    Node head;
    Node tail;

    public class Node{
        int data;
        Node next;
    }

    public void insert(int data){
        Node new_node  =  new Node();
        new_node.data = data;
        new_node.next = null;

        if(head == null){
            head = new_node;
        } else {
            tail.next = new_node;
        }
        tail = new_node;
        tail.next = head;
    }

    public void show(){
        Node n = head;

        if(head != null){
            do{
                System.out.print(n.data + " -> ");
                n = n.next;
            } while(n != head);
            System.out.print(n.data); // This reprents that the list is circular in nature.
        }
    }

    public static void main(String[] args) {
        Circular_linked_list list = new Circular_linked_list();

        list.insert(5);
        list.insert(7);
        list.insert(9);
        list.insert(45);

        list.show();
    }
}