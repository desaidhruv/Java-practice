public class Search_in_Circular_LinkedList {
    Node head;
    Node tail;

    public class Node {
        int data;
        Node next;
    }

    public void insert(int data){
        Node newNode = new Node();
        newNode.data = data;
        newNode.next = null;

        Node n = head;
        if(n == null){
            head = newNode;
        } else {
            tail.next = newNode;
        }
        tail = newNode;
        tail.next = head;
    }

    public void search(int key){
        Node n = head;
        boolean flag = false;
        if(n != null){
            do{
                if(n.data == key){
                    flag = true;
                    break;
                }
                n = n.next;
            }while(n != head);
        }
        if(flag){
            System.out.println(key + " Is present in the list");
        } else {
            System.out.println(key + " Does not exist in the list");
        }
    }

    public void show(){
        Node n = head;
        
        if(n != null){
            do{
                System.out.print(n.data + " -> ");
                n = n.next;
            } while(n != head);
            System.out.print(n.data);
        }
    }

    public static void main(String[] args) {
        Search_in_Circular_LinkedList list = new Search_in_Circular_LinkedList();

        list.insert(7);
        list.insert(6);
        list.insert(2);
        list.insert(8);

        list.show();
        System.out.println();
        list.search(7);
        list.search(15);
    }
}