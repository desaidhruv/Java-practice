package LinkedList;

public class LinkedList_MinMax {
    Node head;
    static class Node{
        int data;
        Node next;
        Node(int d){
            data = d;
            next = null;
        }
    }
    public void Max(){
        Node n = head;
        int max = Integer.MIN_VALUE;
        while(n.next != null){
            if(max < n.data){
                max = n.data;
            }
            n = n.next;
        }
        System.out.println("The Largest number in the LinkedList is: "+ max);
    }
    public void Min(){
        Node n = head;
        int min = Integer.MAX_VALUE;
        while(n.next != null){
            if(min > n.data){
                min = n.data;
            }
            n = n.next;
        }
        System.out.println("The minimum number in the LinkedList is: "+ min);
    }
    public void printList(){
        Node n = head;
        while(n != null){
            System.out.print(n.data+ " ");
            n = n.next;
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