package com.stack;

import com.customstack.StackUsingCustomLinkedList;

public class PostFixEvalution {
	public static int evaluatePostfix(String expr) {
        StackUsingCustomLinkedList<Integer> stack = new StackUsingCustomLinkedList<>();
        String[] tokens = expr.split(" ");

        for (String token : tokens) {
            if (isNumeric(token)) {
                stack.push(Integer.parseInt(token));
            } else {
                int b = stack.pop();
                int a = stack.pop();

                int result = switch (token) {
                    case "+" -> a + b;
                    case "-" -> a - b;
                    case "*" -> a * b;
                    case "/" -> a / b;
                    default -> throw new IllegalArgumentException("Invalid operator: " + token);
                };
                stack.push(result);
            }
        }
        return stack.pop();
    }

    private static boolean isNumeric(String str) {
        try {
            Integer.parseInt(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public static void main(String[] args) {
        String expr = "2 3 1 * + 9 -";
        System.out.println("Postfix Expression: " + expr);
        int result = evaluatePostfix(expr);
        System.out.println("Result: " + result);
    }
}
