package LinkedList;

public class Singly_search {
    private Node head;
    private static class Node {
        private int data;
        private Node next;
        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    public void search(Node head,int searchKey) {
        Node current = head;
        int flag = 0;
        while (current != null) {
            if(current.data == searchKey) {
                System.out.println("The number "+searchKey+" is found in the Linked List.");
                flag = 1;
                break;
            }
            current = current.next;
            
        }
        if(flag != 1) {
            System.out.println("The number "+searchKey+" is not found in the Linked List.");
        }
    }
    public void display(Node head) {
        if (head == null) {
            return;
        }

        Node current = head;

        while(current != null) {
            System.out.print(current.data+ " --> "); // print current element's data.
            current = current.next;
        }
        System.out.print(current); // here current will be null
    }
    public static void main(String[] args) {
        Node head = new Node(10);
        Node second = new Node(8);
        Node third = new Node(4);
        Node fourth = new Node(12);

        // Attach them together
        head.next = second; // 10 --> 8
        second.next = third; // 8 --> 4
        third.next = fourth; // 4 --> 12
        Singly_search list = new Singly_search();
        list.display(head);
        System.out.println();
        list.search(head,15);

    }
}