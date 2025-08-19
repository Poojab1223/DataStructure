package com.stack;

public class MinStackMaiClass {
	public static void main(String[] args) {
        MinStack minStack = new MinStack();
        minStack.push(3);
        minStack.push(5);
        System.out.println(minStack.getMin()); 
        minStack.push(2);
        minStack.push(1);
        System.out.println(minStack.getMin());
        minStack.pop();
        System.out.println(minStack.getMin()); 
        System.out.println(minStack.top());    
    }

}
