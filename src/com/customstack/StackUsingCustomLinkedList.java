package com.customstack;

import com.customLinkedList.CustomLinkedList;

public class StackUsingCustomLinkedList {
	private CustomLinkedList list;

    public StackUsingCustomLinkedList() {
        list = new CustomLinkedList();
    }

    // Push = add at head
    public void push(int data) {
        list.addFirst(data);
    }

    // Pop = remove from head
    public int pop() {
        if (list.isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }
        int top = list.get(0);
        list.deleteFirst();
        return top;
    }

    // Peek = value at head
    public int peek() {
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
        list.printList(); // since list.printList prints from head to end
    }

}
