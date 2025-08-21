package com.customLinkedList;

public class CustomLinkedList {
	private class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node head;  // reference to first node
    private int size;   // keep track of size

    public CustomLinkedList() {
        head = null;
        size = 0;
    }

    // 1. Insert at beginning
    public void addFirst(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
        size++;
    }

    // 2. Insert at end
    public void addLast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node curr = head;
            while (curr.next != null) {
                curr = curr.next;
            }
            curr.next = newNode;
        }
        size++;
    }

    // 3. Insert at index
    public void insertAt(int index, int data) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("Invalid index");
        }
        if (index == 0) {
            addFirst(data);
            return;
        }
        Node newNode = new Node(data);
        Node curr = head;
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
            Node curr = head;
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
        Node curr = head;
        for (int i = 0; i < index - 1; i++) {
            curr = curr.next;
        }
        curr.next = curr.next.next;
        size--;
    }

    // 7. Get element at index
    public int get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Invalid index");
        }
        Node curr = head;
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
        Node curr = head;
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
