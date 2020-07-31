public class Length {
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
        } else  {
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

    public void size() {
        Node n = head;
        int count = 0;

        while(n != null){
            count++;
            n = n.next;
        }
        System.out.println();
        System.out.println("Size of Linked List " + count);
    }

    public static void main(String[] args) {
        Length list = new Length();

        list.insert(5);
        list.insert(9);
        list.insert(1);
        list.insert(8);

        list.show();

        list.size();
    }
}