public class Insert_at_Index {
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

    public void insertAt(int index, int data){
        Node new_node = new Node();
        new_node.data = data;

        if(index == 0){
            head  = new_node;
        } else {
            Node n = head;

            for(int i = 0; i < index -1; i++){
                n = n.next;
            }
            new_node.next = n.next;
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

    public static void main(String[] args) {
        Insert_at_Index list = new Insert_at_Index();

        list.insert(5);
        list.insert(1);
        list.insert(9);
        list.insert(4);

        list.insertAt(2, 10);
        list.show();
    }
}