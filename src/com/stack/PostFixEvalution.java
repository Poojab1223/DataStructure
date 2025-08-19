package com.stack;

import java.util.Stack;

public class PostFixEvalution {
	 public static int evaluatePostfix(String expression) {
	        Stack<Integer> stack = new Stack<>();
	        String[] tokens = expression.split(" ");

	        for (String token : tokens) {
	            
	            if (Character.isDigit(token.charAt(0))) {
	                stack.push(Integer.parseInt(token));
	            } 
	            
	            else {
	                int val1 = stack.pop();
	                int val2 = stack.pop();

	                switch (token) {
	                    case "+":
	                        stack.push(val2 + val1);
	                        break;
	                    case "-":
	                        stack.push(val2 - val1);
	                        break;
	                    case "*":
	                        stack.push(val2 * val1);
	                        break;
	                    case "/":
	                        stack.push(val2 / val1);
	                        break;
	                }
	            }
	        }
	        return stack.pop();
	    }

	    public static void main(String[] args) {
	        String expr = "2 3 1 * + 9 -";
	        System.out.println(evaluatePostfix(expr));  
	    }

}
