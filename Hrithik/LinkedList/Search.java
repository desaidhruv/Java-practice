
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

    public void search(int x){
        Node n = head;
        int flag = 0;
        while(n.next != null){
            if(n.data ==  x){
                System.out.println(x + " is present in the list");
                flag = 1;
                break;
            }
            n = n.next;
        }
        if(flag != 1){
            System.out.println("Not present in the list");
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

        list.search(20);
        list.show();
    }
}