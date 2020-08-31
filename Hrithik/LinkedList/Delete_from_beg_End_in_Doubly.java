import java.util.*;

public class Delete_from_beg_End_in_Doubly {
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

    public void deleteFromBegInDoubly(){
        if(isEmpty()){
            throw new NoSuchElementException();
        }
        Node temp = head;
        if(head == null){
            tail = null;
        } else {
            head.next.prev = null;
        }
        head = head.next;
        temp.next = null;

        System.out.println("Deleted Node is " + temp.data);
        
    }
    public void deleteFromEndInDoubly(){
        if(isEmpty()){
            throw new NoSuchElementException();
        }
        Node temp = tail;
        if(head == tail){
            head = null;
        } else {
            tail.prev.next = null;
        }
        tail = tail.prev;
        temp.prev = null;
        System.out.println("Deleted Node is " + temp.data);
        
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
        Delete_from_beg_End_in_Doubly list = new Delete_from_beg_End_in_Doubly();

        list.insert(4);
        list.insert(2);
        list.insert(5);
        list.insert(9);
        list.show_from_head();
        System.out.println();
        list.deleteFromBegInDoubly();
        list.show_from_head();
        System.out.println();
        list.deleteFromEndInDoubly();
        list.show_from_head();
    }
}