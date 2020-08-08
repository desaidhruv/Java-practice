public class Min_Max_in_LinkedList{
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

    public void Minimum(){
        Node n = head;
        int min = head.data;
        while(n.next != null){
            if(n.data < min){
                min = n.data;
            }
            n = n.next;
        }
        System.out.println("The minimum value in the list is " + min);
    }

    public void Maximum(){
        Node n = head;
        int max = head.data;
        while (n.next != null) {
            if(n.data > max){
                max = n.data;
            }
            n = n.next;
        }
        System.out.println("The maximum value in the list is " + max);
    }

    public void show(){
        Node n = head;

        while(n.next != null){
            System.out.print(n.data + " -> ");
            n = n.next;
        }
        System.out.print(n.data + " -> " + n.next);
    }

    public static void main(String[] args) {
        Min_Max_in_LinkedList list = new Min_Max_in_LinkedList();

        list.insert(8);
        list.insert(5);
        list.insert(1);
        list.insert(6);

        list.show();
        System.out.println();
        list.Minimum();
        list.Maximum();
    }
}