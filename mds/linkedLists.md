## Linked List in A Data Structure: All You Need to Know

## What is Linked List ?
- A linked list is a linear data structure, in which **the elements are stored in the form of a node**. Each node contains two sub-elements. **A data part stores the value of the element and next part stores the pointer to the next node**.

- The **first node also known as HEAD is always used as a reference to traverse the list**. The last node points to NULL. Linked list can be visualized as a chain of nodes, where every node points to the next node.

## Implementation of Linked List.

```java
class Node{
 /*
  Each node contains two sub-elements. **A data part stores the value of the element and next part stores the pointer to the next node
 */   
    int data;
    Node next;
/*
 * creating constructer to initialize the variables like data and next then  it will make it as linked list that contains  data and address pointing to a next value.
*/
    public void Node(int data)
    {
        this.data = data;
        this.next = next;
    }
}
```
## create a your first linked list.

- let us consider **Head and Tail** be the first and last node of every linked list respectively.
- let us consider a **empty linked list**, It means **Head and Tail** points to **NULL**. 

- let us consider we are adding a node to this **empty linked list** then **Head and Taill points to same node when the size of the list is 1**

## How to create a Singly Linked List ?

- If our linked list is empty and  we are adding a node to the list then **head and tail points to that node**.

- At first, size of a linked list is zero when we are adding a node to the list then we wanna **increment that value**.

```java

public void addNode(int data)
{
    Node newNode = new Node(data);
if(head == null)
{
    head = newNode;
    tail = newNode;
}

// Otherwise we are adding the node at the end of the list that is **Tail**. we wanna connect end of the list with **newNode** and **assigning newNode to Tail** and here also we are incrementing the size value.

else{
    tail.next = newNode;  //.next is used to make connection between two nodes.
    tail = newNode;
}
}
```

## How to traverse form head node to last node in a linked list ?

- Let us consider a temporary variable that is type of **Node** and assign it to head.
- After you wanna access data by using "."data and "."next is used to move forward form one node to another node and also when ever the temp variable is equal to null then loop stops.

```java

public void display(){
    while(temp!=null)
{
    System.out.print(temp.data + " -> ");
    temp.next = next;
}
System.out.println("End");
}
```

## HOw to add a element at First node or Head Node ?

- when ever you are adding a newNode to the list at head or first , newNode always pointing to the head node and head is assign to the newNode .

```java
public void addFirst(int data)
{
    Node newNode = new Node(data);   // this will the object for Node type or linked list 
    newNode.next = head ;
    head = newNode;
}

```

## How to add a element at Last Node or Tail Node ?

- when ever you are adding a newNode to the list at last or Tail, tail is pointing to the newNode and tail is assigned with newNode.

```java

public void addLast(int data)
{
    Node newNode = new Node(data);
    tail.next = newNode;
    tail = newNode;  // we are considering tail as a last node in list that's why only  we are moving tail to last node.
}
```

## How to add a element at a given position or a given index ?

- we need to need traverse form head node to given index later you get that address of that node later you need to create object of that and data and that address . if size is equal to 0 then we will wall addFirst(data) and also size is equal to size then we will call addFirst(data).

```java 

public void addAtPosition(int data , int index)
{
    Node temp = head;
    for(int i=1;i<index;i++)
    {
        temp = temp.next;
    }
    Node newNode = new Node(data, temp);
    temp.next = temp.next.next;

}
```

## How to add a node at Head position ?

![Insertion in at head](https://github.com/HumbleFool830/100-Day-s-of-DSA-challenge-/blob/main/Images/insertion.jpg)

