package com.stack;

import com.customstack.StackUsingCustomLinkedList;

public class MinStackMainClass {
	public static void main(String[] args) {
		StackUsingCustomLinkedList<Integer> stack = new StackUsingCustomLinkedList<>();

        stack.push(10);
        stack.push(20);
        stack.push(30);

        stack.printStack();  // Top -> 30 → 20 → 10 → null

        System.out.println("Peek: " + stack.peek()); // 30
        System.out.println("Pop: " + stack.pop());   // 30

        stack.printStack();  // Top -> 20 → 10 → null   
    }
}
