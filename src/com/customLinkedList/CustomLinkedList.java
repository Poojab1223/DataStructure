package com.customLinkedList;

public class CustomLinkedList<T> {

    private Node<T> head;  // reference to first node
    private int size;   // keep track of size

    public CustomLinkedList() {
        head = null;
        size = 0;
    }

    // 1. Insert at beginning
    public void addFirst(T data) {
        Node<T> newNode = new Node<T>(data);
        newNode.next = head;
        head = newNode;
        size++;
    }

    // 2. Insert at end
    public void addLast(T data) {
        Node<T> newNode = new Node<T>(data);
        if (head == null) {
            head = newNode;
        } else {
            Node<T> curr = head;
            while (curr.next != null) {
                curr = curr.next;
            }
            curr.next = newNode;
        }
        size++;
    }

    // 3. Insert at index
    public void insertAt(int index, T data) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("Invalid index");
        }
        if (index == 0) {
            addFirst(data);
            return;
        }
        Node<T> newNode = new Node<T>(data);
        Node<T> curr = head;
        for (int i = 0; i < index - 1; i++) {
            curr = curr.next;
        }
        newNode.next = curr.next;
        curr.next = newNode;
        size++;
    }

    // 4. Delete first
    public void deleteFirst() {
        if (head == null) {
            throw new RuntimeException("List is empty");
        }
        head = head.next;
        size--;
    }

    // 5. Delete last
    public void deleteLast() {
        if (head == null) {
            throw new RuntimeException("List is empty");
        }
        if (head.next == null) {
            head = null;
        } else {
            Node<T> curr = head;
            while (curr.next.next != null) {
                curr = curr.next;
            }
            curr.next = null;
        }
        size--;
    }

    // 6. Delete at index
    public void deleteAt(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Invalid index");
        }
        if (index == 0) {
            deleteFirst();
            return;
        }
        Node<T> curr = head;
        for (int i = 0; i < index - 1; i++) {
            curr = curr.next;
        }
        curr.next = curr.next.next;
        size--;
    }

    // 7. Get element at index
    public T get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Invalid index");
        }
        Node<T> curr = head;
        for (int i = 0; i < index; i++) {
            curr = curr.next;
        }
        return curr.data;
    }

    // 8. Get size
    public int size() {
        return size;
    }

    // 9. Print all elements
    public void printList() {
        Node<T> curr = head;
        while (curr != null) {
            System.out.print(curr.data + " → ");
            curr = curr.next;
        }
        System.out.println("null");
    }

	public boolean isEmpty() {
		return size == 0;
	}

}
