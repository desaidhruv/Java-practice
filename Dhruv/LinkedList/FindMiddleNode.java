package LinkedList;

public class FindMiddleNode {
    Node head;
    private static class Node {
        private int data;
        private Node next;
        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    public Node middleNode(Node head) {
        if(head == null) {
            return null;
        }
        Node slowptr = head; // to get the middle Node
        Node fastptr = head; // To traverse till the end of LL by jumping two Nodes at a time.
        while (fastptr != null && fastptr.next != null) { // Checking whether the value is null or not. 
            slowptr = slowptr.next;
            fastptr = fastptr.next.next;
        }
        return slowptr;
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
        // 10 --> 8 --> 4 --> 12 --> null
        // 10 as head node
        Node head = new Node(10);
        Node second = new Node(8);
        Node third = new Node(14);
        Node fourth = new Node(12);
        Node five = new Node(25);

        // Attach them together
        head.next = second; // 10 --> 8
        second.next = third; // 8 --> 4
        third.next = fourth; // 4 --> 12
        fourth.next = five;
        FindMiddleNode list = new FindMiddleNode();
        list.display(head);
        System.out.println();
        Node middle = list.middleNode(head);
        System.out.println("The middle node is: " + middle.data);
        // System.out.println("The length of Linked List is: " + list.length(head));
    }
}