package LinkedList;

public class SortedLL_insert {
    Node head;
    private static class Node {
        private int data;
        private Node next;
        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    public Node insert(Node head,int data) {
        Node newNode = new Node(data);
        if(head == null) {
            return newNode;
        }
        Node current = head;
        Node temp = null;
        while (current != null && current.data < newNode.data) {
            temp = current;
            current = current.next;
        }
        newNode.next = current;
        temp.next = newNode;
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
        // 2 --> 4 --> 6 --> 12 --> null
        // 2 as head node
        Node head = new Node(2);
        Node second = new Node(4);
        Node third = new Node(6);
        Node fourth = new Node(12);

        // Attach them together
        head.next = second; // 2 --> 4
        second.next = third; // 4 --> 6
        third.next = fourth; // 6 --> 12
        SortedLL_insert list = new SortedLL_insert();
        list.display(head);
        System.out.println();
        Node newHead = list.insert(head,8);
        list.display(newHead);
    }
}