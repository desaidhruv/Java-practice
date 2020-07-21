class LinkedList { 
    Node head; 
    
    static class Node { 
        int data; 
        Node next; 
        Node(int d) 
        { 
            data = d; 
            next = null; 
        } // Constructor 
    } 
    public void show() 
    { 
        Node n = head; 
        while (n != null) { 
            System.out.print(n.data + " -> "); 
            n = n.next; 
        } 
    } 
    
    public static void main(String[] args) { 
        
        LinkedList llist = new LinkedList(); 

        llist.head = new Node(18); 
        Node second = new Node(45); 
        Node third = new Node(69); 
        Node fourth = new Node(85); 

        llist.head.next = second; 
        second.next = third; 
        third.next = fourth;
        llist.show(); 
    } 
}