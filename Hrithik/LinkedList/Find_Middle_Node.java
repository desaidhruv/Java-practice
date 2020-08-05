public class Find_Middle_Node {
    Node head;

    class Node {
        int data;
        Node next;
    }

    public void insert(int data) {
        Node new_node = new Node();
        new_node.data = data;
        new_node.next = null;

        if(head == null){
            head = new_node;
        } else{
            Node n = head;

            while(n.next != null){
                n= n.next;
            }
            n.next = new_node;
        }
    }

    public void find_middle_node(){
        
        Node slow_ptr = head;
        Node fast_ptr = head;

        while(fast_ptr != null && fast_ptr.next != null){
            slow_ptr = slow_ptr.next;
            fast_ptr = fast_ptr.next.next;
        }
        System.out.println("The middle element is " + slow_ptr.data );
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
        Find_Middle_Node list = new Find_Middle_Node();

        list.insert(45);
        list.insert(24);
        list.insert(76);
        list.insert(90);
        list.insert(8);
        list.insert(40);

        list.find_middle_node();
        list.show();
    }
}