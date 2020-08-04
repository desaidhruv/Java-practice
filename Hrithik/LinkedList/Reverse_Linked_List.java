public class Reverse_Linked_List {
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
    public void reverse(){
        Node current = head;
        Node previous = null;
        Node next = null;

        while(current != null){
            next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }
        Node n = previous;
        while (n.next != null) {
            System.out.print(n.data + " -> ");
            n = n.next;
        }
        System.out.print(n.data);
    }
    
    public static void main(String[] args) {
        Reverse_Linked_List list = new Reverse_Linked_List();

        list.insert(45);
        list.insert(15);
        list.insert(35);
        list.insert(75);
        list.insert(90);

        list.reverse();
        
        
        

    }
}
