public class Delete_in_Circular_LinkedList {
    Node head;
    Node tail;

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
            tail.next = new_node;
        }
        tail = new_node;
        tail.next = head;
    }

    public void delete(int key) {
        Node n = head;

        if(n != null) {
            if(n.data == key){
                head = head.next;
                tail.next = head;
            } else {
                do{
                Node temp = n.next;
                if(temp.data == key){
                    n.next = temp.next;
                    break;
                }
                n = n.next;
                }while(n != head);
            }
        }
    }

    public void show(){
        Node n = head;

        if(n != null){
            do{
                System.out.print(n.data + " -> ");
                n = n.next;
            }while(n != head);
            System.out.print(n.data);
        }
    }

    public static void main(String[] args) {
        Delete_in_Circular_LinkedList list = new Delete_in_Circular_LinkedList();

        list.insert(8);
        list.insert(2);
        list.insert(7);
        list.insert(14);
        list.show();
        list.delete(7);
        list.show();
    }
}