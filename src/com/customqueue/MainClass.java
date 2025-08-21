package com.customqueue;

public class MainClass {
	public static void main(String[] args) {
		QueueUsingCustomLinkedList queue = new QueueUsingCustomLinkedList();

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);

        queue.printQueue(); // Front -> 10 → 20 → 30 → null

        System.out.println("Peek: " + queue.peek()); // 10

        System.out.println("Dequeued: " + queue.dequeue()); // 10
        queue.printQueue(); // Front -> 20 → 30 → null

        System.out.println("Size: " + queue.size()); // 2
        System.out.println("Is Empty: " + queue.isEmpty()); // false
    }
}

