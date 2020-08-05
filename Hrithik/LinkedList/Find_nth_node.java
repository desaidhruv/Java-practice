
public class Find_nth_node {
    Node head;

    public class Node {
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

    public void findNthNode(int n){
        Node main = head;
        Node jumper = head;
        int count = 0;

        while(count < n){
            jumper = jumper.next;
            count++;
        }
        
        while(jumper != null){
            jumper = jumper.next;
            main = main.next;
        }
        System.out.println("The nth node is " + main.data);
        
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
        Find_nth_node list = new Find_nth_node();

        list.insert(55);
        list.insert(15);
        list.insert(5);
        list.insert(4);
        list.insert(2);

        list.show();
        System.out.println();
        list.findNthNode(3);
    }
}