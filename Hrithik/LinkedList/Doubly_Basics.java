/**
 * Doubly_Basics
 */
public class Doubly_Basics {
    Node head;
    Node tail;
    int length;
    

    public class Node{
        int data;
        Node next;
        Node prev;
    }
    
    public boolean isEmpty(){
        return length == 0; //head == null
    }
    public int length(){
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

    public void show_from_head(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.print("null");
    }
    public void show_from_tail(){
        Node temp = tail;
        while(temp != null){
            System.out.print(temp.data + " -> ");
            temp = temp.prev;
        }
        System.out.print("null");
    }


    public static void main(String[] args) {
        Doubly_Basics list = new Doubly_Basics();

        list.insert(5);
        list.insert(3);
        list.insert(8);
        list.insert(15);

        list.show_from_head();
        System.out.println();
        list.show_from_tail();
    }
}