package com.customstack;

import com.customLinkedList.CustomLinkedList;

public class StackUsingCustomLinkedList<T> {
	private CustomLinkedList<T> list;

    public StackUsingCustomLinkedList() {
        list = new CustomLinkedList<>();
    }

    // Push = add at head
    public void push(T data) {
        list.addFirst(data);
    }

    // Pop = remove from head
    public T pop() {
        if (list.isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }
        T top = list.get(0);
        list.deleteFirst();
        return top;
    }

    // Peek = value at head
    public T peek() {
        if (list.isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }
        return list.get(0);
    }

    // Check empty
    public boolean isEmpty() {
        return list.isEmpty();
    }

    // Size
    public int size() {
        return list.size();
    }

    // Print stack (top to bottom)
    public void printStack() {
        System.out.print("Top -> ");
        list.printList(); // prints from head to end
    }

}
