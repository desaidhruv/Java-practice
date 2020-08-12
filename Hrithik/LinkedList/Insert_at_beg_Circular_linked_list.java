public class Insert_at_beg_Circular_linked_list {
    Node head;
    Node tail;

    public class Node{
        int data;
        Node next;
    }

    public void insert(int data){
        Node new_node = new Node();
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

    public void insertAtBeg(int data){
        Node new_node = new Node();
        new_node.data = data;
        new_node.next = null;

        if(head == null){
            // if list is empty then head and tails both will point to new node.
            head = new_node;
            tail = new_node;
            new_node.next = head;
        } else {
            Node temp = head;
            new_node.next = temp;
            head = new_node;
            tail.next = head;
        }
    }

    public void show(){
        Node n = head;

        if(head != null){
            do{
                System.out.print(n.data + " -> ");
                n = n.next;
            } while(n != head);
            System.out.print(n.data);
        }
    }

    public static void main(String[] args) {
        Insert_at_beg_Circular_linked_list list = new Insert_at_beg_Circular_linked_list();

        list.insert(7);
        list.insert(4);
        list.insert(9);
        list.insert(16);

        list.insertAtBeg(15);
        list.insertAtBeg(55);
        list.show();
    }
}