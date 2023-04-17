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