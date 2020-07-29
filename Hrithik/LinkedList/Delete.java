public class Delete {
    Node head;

    public class Node{
        int data;
        Node next;
    }

    public void insert(int data){
        Node new_node = new Node();
        new_node.data = data;
        new_node.next = null;

        if(head == null){
            head = new_node;
        } else {
            Node n = head;
            while(n.next != null){
                n = n.next;
            }
            n.next = new_node;
        }
    }
    
    public void delete(int index){
        if(index  == 0){
            head = head.next;
        }
        else {
            Node n = head;
            Node n1 = null;

            for(int i = 0; i < index - 1 ; i++){
                n = n.next;
            }
            n1 = n.next;
            n.next = n1.next;
            System.out.println("The deleted node is " + n1.data);
        }
    } 

    public void show(){
        Node n = head;
        while(n.next != null){
            System.out.print(n.data + " -> ");
            n = n.next;
        }
        System.out.print(n.data);
    }

    public static void main(String[] args) {
        Delete list = new Delete();
        list.insert(5);
        list.insert(2);
        list.insert(9);
        list.insert(14);
        list.delete(2);
        list.show();

    }
}