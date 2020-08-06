public class Remove_Duplicate{
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

    public void duplicate(){
        Node current = head;

        while(current != null && current.next != null){
            if (current.data == current.next.data) {
                current.next = current.next.next;
            } else {
                current = current.next;
            }
        }
    }

    public void show(){
        Node n = head;

        while (n.next != null) {
            System.out.print(n.data + " -> ");
            n = n.next;
        }
        System.out.print(n.data + " -> " + n.next);
    }

    public static void main(String[] args) {
        Remove_Duplicate list = new Remove_Duplicate();

        list.insert(1);
        list.insert(1);
        list.insert(1);
        list.insert(2);
        list.insert(2);
        list.insert(3);
        list.insert(7);

        list.show();
        System.out.println();
        System.out.println("After removing duplicate in sorted list");
        
        list.duplicate();
        list.show();
    }
}