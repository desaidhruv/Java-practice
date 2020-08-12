public class Detect_loop_in_Linked_list {
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

    public boolean detect_loop(){
        Node fast_ptr = head;
        Node slow_ptr = head;

        while(fast_ptr != null && fast_ptr.next != null){
            fast_ptr = fast_ptr.next.next;
            slow_ptr = slow_ptr.next;

            if(slow_ptr == fast_ptr){
                return true;
            }
        }
        return false;
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
        Detect_loop_in_Linked_list list = new Detect_loop_in_Linked_list();

        list.insert(10);
        list.insert(40);
        list.insert(50);
        list.insert(20);

        list.show();
        System.out.println();
        
        boolean loop = list.detect_loop();
        System.out.println(loop);
    }
}