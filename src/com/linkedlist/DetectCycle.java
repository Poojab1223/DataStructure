package com.linkedlist;

public class DetectCycle {
	public static void main(String[] args) {
		 Node head = new Node(1);
	        head.next = new Node(2);
	        head.next.next = new Node(3);
	        head.next.next.next = new Node(4);
	        head.next.next.next.next = head.next; // cycle here

	        System.out.println("Cycle present? " + hasCycle(head));
	    }

	    // Floyd’s Cycle Detection
	    private static boolean hasCycle(Node head) {
	        if (head == null) return false;

	        Node slow = head;
	        Node fast = head;

	        while (fast != null && fast.next != null) {
	            slow = slow.next;          
	            fast = fast.next.next;     

	            if (slow == fast) {        
	                return true;
	            }
	        }
	        return false;
	}

}
