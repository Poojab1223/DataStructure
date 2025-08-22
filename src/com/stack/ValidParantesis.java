package com.stack;

import com.customstack.StackUsingCustomLinkedList;

public class ValidParantesis {
	public static boolean isValid(String s) {
        StackUsingCustomLinkedList<Character> stack = new StackUsingCustomLinkedList<>();

        for (char ch : s.toCharArray()) {
            // If it's an opening bracket, push to stack
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            } 
            // If it's a closing bracket, check stack
            else {
                if (stack.isEmpty()) {
                    return false; // No matching opening
                }
                char top = stack.pop();
                if ((ch == ')' && top != '(') ||
                    (ch == '}' && top != '{') ||
                    (ch == ']' && top != '[')) {
                    return false; // mismatch
                }
            }
        }

        // If stack is empty, everything matched
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String input1 = "{[()]}";
        String input2 = "{[(])}";
        String input3 = "((()))";
        String input4 = "([)]";

        System.out.println(input1 + " → " + isValid(input1)); // true
        System.out.println(input2 + " → " + isValid(input2)); // false
        System.out.println(input3 + " → " + isValid(input3)); // true
        System.out.println(input4 + " → " + isValid(input4)); // false
    }
}
