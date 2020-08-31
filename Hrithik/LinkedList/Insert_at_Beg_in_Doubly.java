public class Insert_at_Beg_in_Doubly {
    Node head;
    Node tail;
    int length;

    public class Node{
        int data;
        Node next;
        Node prev;
    }

    public boolean isEmpty() {
        return length == 0;
    }
    
    public int length() {
        return length;
    }

    public void insert(int data){
        Node newNode = new Node();
        newNode.data = data;

        if(isEmpty()){
            head = newNode;
        } else { 
            tail.next = newNode;
        }
        newNode.prev = tail;
        tail = newNode;
        length++;
    }
    public void insert_at_beg(int data){
        Node newNode = new Node();
        newNode.data = data;

        if(isEmpty()){
            tail = newNode;
        } else { 
            head.prev = newNode;
        }
        newNode.next = head;
        head = newNode;
    }

    public void show_from_head(){
        Node temp = head;

        while(temp != null){
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.print("null");
    }

    public static void main(String[] args) {
        Insert_at_Beg_in_Doubly list = new Insert_at_Beg_in_Doubly();

        list.insert(10);
        list.insert(30);
        list.insert_at_beg(5);
        list.insert(50);

        list.show_from_head();
    }
}
