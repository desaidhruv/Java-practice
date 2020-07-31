
public class Search{
    Node head;

    public class Node{
        int data;
        Node next;
    }

    public void insert(int data){
        Node new_node = new Node();
        new_node.data = data;
        // new_node.next = null;

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

    public void search(int key){
        Node n = head;
        boolean result = false;
        while(n != null){
            if(n.data == key){
                result = true;
                break;
            }
            n = n.next;
        }
        if(result){
            System.out.println("Element " + key +" is present");
        } else{
            System.out.println("Element "+ key +" is not present");
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
        Search list = new Search();

        list.insert(5);
        list.insert(9);
        list.insert(4);
        list.insert(2);

        list.show();
        System.out.println();
        list.search(9);
    }
}