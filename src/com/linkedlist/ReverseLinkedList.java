package com.linkedlist;

public class ReverseLinkedList {
	public static void main(String[] args) {
		 Node head = new Node(1);
	        head.next = new Node(2);
	        head.next.next = new Node(3);
	        head.next.next.next = new Node(4);

	        System.out.print("Original List: ");
	        printList(head);

	        head = reverseList(head);

	        System.out.print("Reversed List: ");
	        printList(head);
	    }

	    // Iterative method
	    private static Node reverseList(Node head) {
	        Node prev = null;
	        Node curr = head;
	        Node next;

	        while (curr != null) {
	            next = curr.next;    
	            curr.next = prev;    
	            prev = curr;         
	            curr = next;         
	        }
	        return prev;  
	    }

	    private static void printList(Node head) {
	        while (head != null) {
	            System.out.print(head.data + " -> ");
	            head = head.next;
	        }
	        System.out.println("null");
	    }
	

}
