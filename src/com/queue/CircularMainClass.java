package com.queue;

public class CircularMainClass {
	public static void main(String[] args) {
		CircularQueue cq = new CircularQueue(3);

        System.out.println(cq.enQueue(1)); 
        System.out.println(cq.enQueue(2)); 
        System.out.println(cq.enQueue(3)); // true
        System.out.println(cq.enQueue(4)); // false (queue full)

        System.out.println(cq.Rear()); // 3
        System.out.println(cq.isFull()); // true

        System.out.println(cq.deQueue()); // true
        System.out.println(cq.enQueue(4)); // true
        System.out.println(cq.Rear());
	}

}
