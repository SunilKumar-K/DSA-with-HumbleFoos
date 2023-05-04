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

if(head == null)
{
    head = newNode;
    tail = newNode;
}
```
- Otherwise we are adding the node at the end of the list that is **Tail**. we wanna connect end of the list with **newNode** and **assigning newNode to Tail** and here also we are incrementing the size value.

```java
else{
    tail.next = newNode;  //.next is used to make connection between two nodes.
    tail = newNode;
}
```

## How to add a node at Head position ?

https://github.com/HumbleFool830/100-Day-s-of-DSA-challenge-/blob/main/Images/insertion.jpghttps://github.com/HumbleFool830/100-Day-s-of-DSA-challenge-/blob/main/Images/insertion.jpg