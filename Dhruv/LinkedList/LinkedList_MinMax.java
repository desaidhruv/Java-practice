package LinkedList;

public class LinkedList_MinMax {
    Node head;
    static class Node{ //Node created.
        int data;
        Node next;
        Node(int d){
            data = d;
            next = null;
        }
    }
    public void Max(){ //Find the maximum Number in the Linked List.
        Node current = head;
        int max = Integer.MIN_VALUE;
        while(current.next != null){
            if(max < current.data){
                max = current.data;
            }
            current = current.next;
        }
        System.out.println("The Largest number in the LinkedList is: "+ max);
    }
    public void Min(){ // Find the minimum Number in the Linked List.
        Node current = head;
        int min = Integer.MAX_VALUE;
        while(current.next != null){
            if(min > current.data){
                min = current.data;
            }
            current = current.next;
        }
        System.out.println("The minimum number in the LinkedList is: "+ min);
    }
    public void printList(){
        Node current = head;
        while(current != null){
            System.out.print(current.data+ " ");
            current = current.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        LinkedList_MinMax list = new LinkedList_MinMax();
        list.head = new Node(15);
        Node n1 = new Node(25);
        Node n2 = new Node(5);
        Node n3 = new Node(10);
        list.head.next = n1;
        n1.next = n2;
        n2.next = n3;
        list.printList();
        list.Max();
        list.Min();
    }
}