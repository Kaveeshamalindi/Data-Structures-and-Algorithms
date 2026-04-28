# Doubly Linked List

- A doubly linked list contains a pointer to the previous as well as the next node in the sequence.
- Its navigation is possible in both forward and backwards.

**Link**: Each link of a linked list can store data called an element.

**Next**: Each link of a linked list contains a link to the next link called Next.

**Prev**: Each link of a linked list contains a link to the previous link called Prev.

---

```Link class``` → represents a single node

This class is responsible for:
- Holding data
- Holding connections (```next```, ```previous```)

```DoublyLinkedList``` → manages the whole list

This class is responsible for:

- Managing the entire list
- Keeping track of:

First node

Last node

- Performing operations like:
  
Insert

Delete

Traverse

```
Link → holds data + pointers
DoublyLinkedList → controls the whole list
```

