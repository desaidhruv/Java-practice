package LinkedList;

public class Singly_reverse {
    Node head;
    private static class Node {
        int data;
        Node next;
        public Node(int data) {
            this.data = data;
            this.next = null;
        }       
    }
    public Node reverse(Node head) {
        Node current = head;
        Node previous = null;
        Node next = null;
        while (current != null) {
            next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }
        return previous;
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
        Singly_reverse list = new Singly_reverse();
        list.display(head);
        Node newHead = list.reverse(head);
        System.out.println();
        list.display(newHead);
    }
}