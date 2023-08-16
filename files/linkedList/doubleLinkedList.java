public class doubleLinkedList{
    public static void main(String[] args) {
        doubleLinkedList dl = new doubleLinkedList();

        dl.addNode(14);
        dl.addNode(15);
        dl.addNode(16);
        dl.addNode(17);
        dl.display();
        dl.addAtFirst(18);
        dl.display();
        dl.addAtLast(20);
        dl.display();

        System.out.println(dl.size);

        dl.addAtMiddle(25, 3);
        dl.display();

        System.out.println(dl.size);

        System.out.println("Deleting Node at First Position : " + dl.deletingNodeAtFirst());

        dl.display();

        System.out.println("Deleting Node at Last Position :"+ dl.deletingNodeAtLast());

        dl.display();
    }

    class Node{
        int data;
        Node next;
        Node prev;

        public Node(int data)
        {
            this.data = data;
            this.next = next;
            this.prev = prev;
        }
        public Node(int data,Node next)
        {
            this.data = data;
            this.next = next;
            this.prev = prev;
        }

    }

    public Node head = null;
    public Node tail = null;
    public int size = 0;

    //First off all considering like linked list is empty.

    public void addNode(int data)
    {
        Node newNode = new Node(data);
        if(head == null)
        {
            head = newNode;
            tail = newNode;
            head.prev = null;
            size++;
        }
        else{
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
            size++;
           
        }
    }

    // Displaying the elements in the linked list you can traverse form head to tail and also tail to head too. 
    public void display(){
        Node current = head;

        while(current != null)
        {
            System.out.print(current.data +" ");
            current = current.next;
        }

        System.out.println();
    }

    //Adding the node at begining of an Doubly linkedlist

    public void addAtFirst(int data)
    {
        Node newNode = new Node(data);

        if(head == null)
        {
            addNode(data);
        }
        else{
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
            newNode.prev = null;
            size++;
        }
    }

    //Adding the node at ending of an Doubly linkedlist

    public void addAtLast(int data)
    {
        Node newNode = new Node(data);
        if(head == null)
        {
            addNode(data);
            
        }
        else{
        tail.next = newNode;
        newNode.prev = tail;
        tail = newNode;
        size++;
        }
    }

     // Adding the node at middle of the Doubly linked list

    public void addAtMiddle(int data,int index)
    {
        if(size == 0)
        {
            addAtFirst(data);
        }
        else if(size <= index)
        {
            addAtLast(data);
        }
        else{
        Node current = head;
        while(index != 1)
        {
           current = current.next;
           index--;
        }

        Node newNode = new Node(data,current.next);
        current.next = newNode.next;
        newNode.prev = current;
        current.next = newNode;
        current.next.prev = newNode;
        size++;
    }

    }

    public int deletingNodeAtFirst()
    {
        int deletingNode = head.data;
        head = head.next;
        head.prev = null;
        return deletingNode;
    }

    public int deletingNodeAtLast()
    {
        int deletingNode = tail.data;
        tail = tail.prev;
        tail.next = null;

        return deletingNode;
    }

}