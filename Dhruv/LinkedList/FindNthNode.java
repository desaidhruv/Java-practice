package LinkedList;

public class FindNthNode {
    Node head;
    private static class Node {
        private int data;
        private Node next;
        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    public Node findNode(Node head,int n) {
        if( n <= 0 ) {
            throw new IllegalArgumentException("Invalid value: n = "+ n);
        }
        Node mainPtr = head;
        Node refPtr = head;
        int count = 0;
        while (count < n){
            if ( refPtr == null) {
                throw new IllegalArgumentException(n + " is greater than the number of nodes in list");
            }
            refPtr = refPtr.next;
            count++;
        } 
        while (refPtr != null) {
            refPtr = refPtr.next;
            mainPtr = mainPtr.next;
        }
        return mainPtr;
    }
    public void display(Node head) {
        if (head == null) { //Check whether Head is empty or not.
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
        FindNthNode list = new FindNthNode();
        list.display(head);
        System.out.println();
        Node nthNode = list.findNode(head, 3);
        System.out.println("The nth position from last is: "+nthNode.data);
    }
}