## Linked List in A Data Structure: All You Need to Know

## What is Linked List ?
- A linked list is a linear data structure, in which **the elements are stored in the form of a node**. Each node contains two sub-elements. **A data part stores the value of the element and next part stores the pointer to the next node**.

- The **first node also known as HEAD is always used as a reference to traverse the list**. The last node points to NULL. Linked list can be visualized as a chain of nodes, where every node points to the next node.

![linkedlist](https://github.com/HumbleFool830/100-Day-s-of-DSA-challenge-/blob/main/Images/linkedlist.webp)

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

## How to traverse in a linked list form head node to last node ?

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

## How to add a element at First node or Head Node ?

- when ever you are adding a newNode to the list at head or first , newNode always pointing to the head node and head is assign to the newNode .

![Insertion in at head](https://github.com/HumbleFool830/100-Day-s-of-DSA-challenge-/blob/main/Images/insertion.jpg)

```java
public void addFirst(int data)
{
    Node newNode = new Node(data);   // this is object like Node type or it will create a linked list with data and next value.
    newNode.next = head ;
    head = newNode;
}

```

## How to add a element at Last Node or Tail Node ?

- when ever you are adding a newNode to the list at last or Tail, tail is pointing to the newNode and tail is assigned with newNode.

![Insert at end](https://github.com/HumbleFool830/100-Day-s-of-DSA-challenge-/blob/main/Images/insertatend.jpeg)

```java

public void addLast(int data)
{
    Node newNode = new Node(data);
    tail.next = newNode;
    tail = newNode;  // we are considering tail as a last node in list that's why only  we are moving tail to last node.
}
```

## How to add a element at a given position or a given index ?

- we need to traverse form head node to given index later you get that address of that node later you need to create object of that data and that address . if size is equal to 0 then we will call addFirst(data) and also index is equal to size then we will call addLast(data) otherwise we follow this procedure.

![Insert at position](https://github.com/HumbleFool830/100-Day-s-of-DSA-challenge-/blob/main/Images/insertatposition.jpeg)

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

## How to delete a head node in linked list ?

- It is very simple , we want to move head form current position to 1 step forward that's enough.

![delete at first](https://github.com/HumbleFool830/100-Day-s-of-DSA-challenge-/blob/main/Images/deleteatfirst.jpeg)

```java

  public int deleteAtFirst()
  {
    int m = head.data;
    head = head.next;
    return m;
  }
```
- Go through corner cases and think about this ***If there is a one element in the linked list or what will happen head pointing to null***


## How to delete a last node in linked list ?

- It is tough to delete a node at last becoz we don't have **tail.previous like this type pointer** 

![delete at end](https://github.com/HumbleFool830/100-Day-s-of-DSA-challenge-/blob/main/Images/deleteatend.jpeg)

## Note:-

**If you want to know the length of linked list then you need to use one variable and also you need to modify it like whenever you adding a node into a list then increment size variable or when ever deleting a node in a linked list then decrement the size variable.** 

```java


public int deleteAtLast()
{
    int m = tail.data;
    Node tail = secondLast(size);
    return m;
}
// here we need a length of a linked list .
public Node secondLast(int size)
{
    Node temp = head;
    for(int i=1;i<size;i++)
    {
        temp = temp.next;
    }

    return temp;
}
```

- In this code we are doing traversing head node to secondlast node in the linked list and that value is pointing to the tail.

## How to delete a node at given index in a linked list ?

- we are considering **1 index** based in linked list otherwise your wish .
- we are traversing form head node to the previous node of the index.
- later on that we are removing connection between previous node to index node and later we are making connection between previous node of index node to after node of index node by giving this **temp.next = temp.next.next**.


![delete at index](https://github.com/HumbleFool830/100-Day-s-of-DSA-challenge-/blob/main/Images/deleteatindex.jpeg)

```java

public int deleteAtIndex(int index)
{
    Node temp = head;
    for(int i=1;i<index;i++)
    {
        temp = temp.next;
    }
    int m = temp.next.data;
    temp.next = temp.next.next;

    return m;
}
```

- In above we are traversing form head node to previous node of index node and later assigning data with **m variable** after that we are making connection between previous node of index node to After node of previous node . 


- **After reading this, go through and  practice once later think about for corner cases and also use pen and paper to analyse the linked lists then you understood more**
