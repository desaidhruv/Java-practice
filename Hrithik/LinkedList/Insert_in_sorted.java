public class Insert_in_sorted {
    Node head;

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
            Node n = head;

            while (n.next != null) {
                n = n.next;
            }
            n.next = new_node;
        }
    }

    public void insertAt(int data){

        Node new_node = new Node();
        new_node.data = data;
        new_node.next = null;
        Node current = head;
        Node temp = null;

        while(current != null && current.data < new_node.data) {
            temp = current;
            current = current.next;
        }
        new_node.next = current;
        temp.next = new_node;


        // For Displaying list
        Node x = head;
        while (x.next != null) {
            System.out.print(x.data + " -> ");
            x = x.next;
        }
        System.out.print(x.data + " -> " + x.next);
    }

    public static void main(String[] args) {
        Insert_in_sorted list = new Insert_in_sorted();

        list.insert(1);
        list.insert(3);
        list.insert(4);
        list.insert(8);

        list.insertAt(5);
    }
}