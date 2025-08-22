package com.queue;

import com.customstack.StackUsingCustomLinkedList;

public class QueueUsingStack<T> {
    private StackUsingCustomLinkedList<T> stack1;
    private StackUsingCustomLinkedList<T> stack2;

    public QueueUsingStack() {
        stack1 = new StackUsingCustomLinkedList<>();
        stack2 = new StackUsingCustomLinkedList<>();
    }

    // Enqueue = push into stack1
    public void enqueue(T x) {
        stack1.push(x);
    }

    // Dequeue = pop from stack2 (or move from stack1 to stack2 first)
    public T dequeue() {
        if (stack1.isEmpty() && stack2.isEmpty()) {
            throw new RuntimeException("Queue is empty");
        }

        if (stack2.isEmpty()) {
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }

        return stack2.pop();
    }

    // Peek front element
    public T peek() {
        if (stack1.isEmpty() && stack2.isEmpty()) {
            throw new RuntimeException("Queue is empty");
        }

        if (stack2.isEmpty()) {
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }

        return stack2.peek();
    }

    // Check empty
    public boolean isEmpty() {
        return stack1.isEmpty() && stack2.isEmpty();
    }

    // Size of queue
    public int size() {
        return stack1.size() + stack2.size();
    }

    // Display queue (front → rear)
    public void display() {
        System.out.print("Queue (front → rear): ");
        // Print elements of stack2 in correct order
        StackUsingCustomLinkedList<T> temp = new StackUsingCustomLinkedList<>();
        while (!stack2.isEmpty()) {
            T val = stack2.pop();
            System.out.print(val + " ");
            temp.push(val); // keep for restoring
        }
        // restore stack2
        while (!temp.isEmpty()) {
            stack2.push(temp.pop());
        }

        // Print elements of stack1 in correct order
        Object[] arr = new Object[stack1.size()];
        int idx = stack1.size() - 1;
        temp = new StackUsingCustomLinkedList<>();
        while (!stack1.isEmpty()) {
            T val = stack1.pop();
            arr[idx--] = val;
            temp.push(val); // restore later
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        // restore stack1
        while (!temp.isEmpty()) {
            stack1.push(temp.pop());
        }

        System.out.println();
    }
}