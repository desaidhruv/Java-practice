public class Remove_key{
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

    public void removeKey(int key){
        Node current = head;
        Node temp = null;

        while(current.next != null && current.data != key){
            temp = current;
            current = current.next;
        }
        if(current != null){
            temp.next = current.next;
        }
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
        Remove_key list = new Remove_key();

        list.insert(5);
        list.insert(9);
        list.insert(8);
        list.insert(15);

        list.removeKey(8);
        list.show();
    }
}