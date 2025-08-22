package com.stack;

import java.util.Stack;

import com.customstack.StackUsingCustomLinkedList;

public class NextGreaterElement {
	public static int[] nextGreater(int[] arr) {
        int n = arr.length;
        int[] result = new int[n];

        StackUsingCustomLinkedList<Integer> stack = new StackUsingCustomLinkedList<>();

        // Traverse array from right to left
        for (int i = n - 1; i >= 0; i--) {
            int curr = arr[i];

            // Pop smaller or equal elements from stack
            while (!stack.isEmpty() && stack.peek() <= curr) {
                stack.pop();
            }

            // If stack is empty → no greater element
            result[i] = stack.isEmpty() ? -1 : stack.peek();

            // Push current element to stack
            stack.push(curr);
        }

        return result;
    }

    public static void main(String[] args) {
        int[] arr = {4, 5, 2, 25};
        int[] ans = nextGreater(arr);

        System.out.print("Next Greater Elements: ");
        for (int val : ans) {
            System.out.print(val + " ");
        }
    }
}
