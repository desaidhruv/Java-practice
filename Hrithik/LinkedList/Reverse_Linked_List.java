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
        Node n = head;
        Node previous_to_n = null;
        Node next_to_n = null;

        while(n != null){
            next_to_n = n.next;
            n.next = previous_to_n;
            previous_to_n = n;
            n = next_to_n;
        }
        
    }


    public void show(){
        Node n = head;
        while(n.next != null){
            System.out.print(n.data + " -> ");
            n = n.next;
        }
        // The loop does not print the data of node having null in next so we manually print it. 
        System.out.print(n.data);
    }

    public static void main(String[] args) {
        Reverse_Linked_List list = new Reverse_Linked_List();

        list.insert(45);
        list.insert(15);
        list.insert(35);
        list.insert(75);

        list.reverse();
        list.show();
        
        

    }
}