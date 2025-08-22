package com.stack;

import com.customstack.StackUsingCustomLinkedList;

public class SortStack {
	 public static void sort(StackUsingCustomLinkedList<Integer> stack) {
	        StackUsingCustomLinkedList<Integer> tempStack = new StackUsingCustomLinkedList<>();

	        while (!stack.isEmpty()) {
	            int curr = stack.pop();

	            // Move elements back from tempStack to stack if they are greater
	            while (!tempStack.isEmpty() && tempStack.peek() > curr) {
	                stack.push(tempStack.pop());
	            }

	            // Place current element in sorted position
	            tempStack.push(curr);
	        }

	        // Move back sorted elements into original stack
	        while (!tempStack.isEmpty()) {
	            stack.push(tempStack.pop());
	        }
	    }

	    public static void main(String[] args) {
	        StackUsingCustomLinkedList<Integer> stack = new StackUsingCustomLinkedList<>();
	        stack.push(3);
	        stack.push(5);
	        stack.push(1);
	        stack.push(4);

	        System.out.print("Original Stack: ");
	        stack.printStack();

	        sort(stack);

	        System.out.print("Sorted Stack: ");
	        stack.printStack();
	    }

}
