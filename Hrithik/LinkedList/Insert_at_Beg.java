public class Insert_at_Beg {
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
            while(n.next != null){
                n = n.next;
            }
            n.next = new_node;
        }
    }

    public void show(){
        Node n = head;

        while(n.next != null){
            System.out.print(n.data + " -> ");
            n = n.next;
        }
        System.out.print(n.data);
    }

    public void insert_at_beg(int data){
        Node new_node = new Node();
        new_node.data = data;
        new_node.next = null;

        new_node.next = head;
        head = new_node;
    }

    public static void main(String[] args) {
        Insert_at_Beg list = new Insert_at_Beg();

        list.insert(5);
        list.insert(2);
        list.insert(4);
        list.insert(8);

        list.insert_at_beg(10);

        list.show();
    }
}