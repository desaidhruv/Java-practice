package LinkedList;

public class RemoveDuplicate {
    Node head;
    private static class Node {
        private int data;
        private Node next;
        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    public Node removeDuplicate(Node head) {
        Node current = head;
        while(current != null && current.next != null) {
            if(current.data == current.next.data) {
                current.next = current.next.next;
            }
            else {
                current = current.next;
            }
        }
        return head;

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
        // 1 --> 1 --> 2 --> 3 --> 3 --> null
        // 1 as head node
        Node head = new Node(1);
        Node second = new Node(1);
        Node third = new Node(2);
        Node fourth = new Node(3);
        Node fifth = new Node(3);

        // Attach them together
        head.next = second; // 1 --> 1
        second.next = third; // 1 --> 2
        third.next = fourth; // 2 --> 3
        fourth.next = fifth; // 3 --> 3
        RemoveDuplicate list = new RemoveDuplicate();
        list.display(head);
        System.out.println();
        Node newHead = list.removeDuplicate(head);
        list.display(newHead);
    }
}