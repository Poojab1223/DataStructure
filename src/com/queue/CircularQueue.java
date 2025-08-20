package com.queue;

public class CircularQueue {
	private int[] arr;
    private int front, rear, size;

    public CircularQueue(int k) {
        arr = new int[k];
        size = k;
        front = -1;
        rear = -1;
    }

    // Insert element
    public boolean enQueue(int value) {
        if (isFull()) {
            return false; // Queue is full
        }
        if (isEmpty()) {
            front = 0;
        }
        rear = (rear + 1) % size;
        arr[rear] = value;
        return true;
    }

    // Delete element
    public boolean deQueue() {
        if (isEmpty()) {
            return false; // Queue is empty
        }
        if (front == rear) { // only one element
            front = -1;
            rear = -1;
        } else {
            front = (front + 1) % size;
        }
        return true;
    }

    // Get front element
    public int Front() {
        if (isEmpty()) return -1;
        return arr[front];
    }

    // Get rear element
    public int Rear() {
        if (isEmpty()) return -1;
        return arr[rear];
    }

    // Check if queue is empty
    public boolean isEmpty() {
        return front == -1;
    }

    // Check if queue is full
    public boolean isFull() {
        return (rear + 1) % size == front;
    }
}
