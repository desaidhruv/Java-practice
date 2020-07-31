public class Delete_Node {
    Node head;

    public class Node {
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
    
    public void Delete_beg(){
        Node temp = head;

        head = head.next;
        temp.next = null;
        
    }
    
    public void Delete_End(){
        Node n = head;
        Node previous_to_n = null;

        while(n.next != null){
            previous_to_n = n;
            n = n.next;
        }
        previous_to_n.next = null;
        System.out.println(n.data + " Is the deleted node");
    }

    public void Delete_at_index(int index) {
        if(index == 0){
            head = head.next;
        } else {
            Node n = head;
            Node n1 = null;

            for(int i = 0; i < index-1; i++){
                n = n.next;
            }
            n1 = n.next;
            n.next = n1.next;
            System.out.println("Deleted Node is " + n1.data);
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
        Delete_Node list = new Delete_Node();

        list.insert(5);
        list.insert(2);
        list.insert(7);
        list.insert(4);
        
        list.Delete_at_index(2);
        // list.Delete_End();
        // list.Delete_beg();
        list.show();
    }
    
}