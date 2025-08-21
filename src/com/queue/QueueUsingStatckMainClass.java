package com.queue;

public class QueueUsingStatckMainClass {
	public static void main(String[] args) {
		 QueueUsingStack q = new QueueUsingStack();
	        q.enqueue(10);
	        q.enqueue(20);
	        q.enqueue(30);

	        System.out.println(q.dequeue()); 
	        System.out.println(q.dequeue()); 

	        q.enqueue(40);
	        System.out.println(q.dequeue()); 
	}
}


