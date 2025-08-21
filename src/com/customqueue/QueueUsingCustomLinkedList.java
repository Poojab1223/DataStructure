package com.customqueue;

import com.customLinkedList.CustomLinkedList;

public class QueueUsingCustomLinkedList<T> {
    private CustomLinkedList<T> list;

    public QueueUsingCustomLinkedList() {
        list = new CustomLinkedList<>();
    }

    // Enqueue = add at end
    public void enqueue(T data) {
        list.addLast(data);
    }

    // Dequeue = remove from front
    public T dequeue() {
        if (list.isEmpty()) {
            throw new RuntimeException("Queue is empty");
        }
        T front = list.get(0);
        list.deleteFirst();
        return front;
    }

    // Peek front element
    public T peek() {
        if (list.isEmpty()) {
            throw new RuntimeException("Queue is empty");
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

    // Print queue (front to rear)
    public void printQueue() {
        System.out.print("Front -> ");
        list.printList(); // head is front, tail is rear
    }
}
