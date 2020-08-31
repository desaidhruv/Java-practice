package LinkedList;

public class SinglyLL {
    Node head; // Head of the Linked List.
    private static class Node {
        private int data;
        private Node next;
        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    public int length(Node head) {
        if (head == null){ // Check whether the Linked List is empty or not.
            return 0;
        }
        Node current = head;
        int count = 0;
        while(current != null) { // Count the nodes.
            count++;
            current = current.next;
        }
        return count;
    }
    public void display(Node head) {
        if (head == null) { // Check whether the Linked List is empty or not.
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
        Node third = new Node(4);
        Node fourth = new Node(12);

        // Attach them together
        head.next = second; // 10 --> 8
        second.next = third; // 8 --> 4
        third.next = fourth; // 4 --> 12
        SinglyLL list = new SinglyLL();
        list.display(head);
        System.out.println();
        System.out.println("The length of Linked List is: " + list.length(head));
    }
}