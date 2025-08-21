package com.customstack;

public class MainClass {
	public static void main(String[] args) {
		StackUsingCustomLinkedList stack = new StackUsingCustomLinkedList();

        stack.push(10);
        stack.push(20);
        stack.push(30);

        stack.printStack(); // Top -> 30 → 20 → 10 → null

        System.out.println("Peek: " + stack.peek()); // 30

        System.out.println("Popped: " + stack.pop()); // 30
        stack.printStack(); // Top -> 20 → 10 → null

        System.out.println("Size: " + stack.size()); // 2
        System.out.println("Is Empty: " + stack.isEmpty()); // false
	}

}
