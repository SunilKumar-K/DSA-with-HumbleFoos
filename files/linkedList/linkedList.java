package linkedLists;


public class linkedList{
    public static void main(String[] args) {
        linkedList ll = new linkedList();
        ll.addNode(3);
        ll.addNode(4);
        ll.addNode(5);
        ll.addNode(6);
        ll.display();
    }

    class Node{
        int data;
        Node next;
        
        public Node(int data)
        {
            this.data = data;
            this.next = next;
        }
    }
    public Node head = null;
    public Node tail = null;
    public int size = 0;

    public void addNode(int data)
    {
        Node newNode = new Node(data); 
        if(head == null)
        {
            head = newNode;
            tail = newNode;
            size++;
        }
        else{
            tail.next = newNode;
            tail = newNode;
            size++;
        }
    }

    public void display()
    {
        Node current = head;
        while(current != null)
        {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("End");
    }
}