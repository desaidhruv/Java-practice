package LinkedList;

public class LinkedList_search {
    Node head;
    static class Node{
        int data;
        Node next;
        Node(int d){
            data = d;
            next = null;
        }
    }
    public void search(int x){
        Node n = head;
        int flag = 0;
        while(n != null){
            if(n.data == x){
                System.out.println("The number "+n.data+" is in the list.");
                flag = 1;
                break;
            }
            n = n.next;
        }
        if(flag != 1){
            System.out.println("The number "+x+" is not present in the list.");
        }
    }
    public static void main(String[] args) {
        LinkedList_search list = new LinkedList_search();
        list.head = new Node(5);
        Node n1 = new Node(10);
        Node n2 = new Node(15);
        list.head.next = n1;
        n1.next = n2;
        list.search(25);
    }
}