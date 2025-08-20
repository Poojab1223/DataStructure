package com.linkedlist;

public class MergerSortedList {
	public static void main(String[] args) {
		 Node l1 = new Node(1);
	        l1.next = new Node(3);
	        l1.next.next = new Node(5);

	        
	        Node l2 = new Node(2);
	        l2.next = new Node(4);
	        l2.next.next = new Node(6);

	        Node merged = mergeLists(l1, l2);

	        System.out.print("Merged List: ");
	        printList(merged);
	    }

	    private static Node mergeLists(Node l1, Node l2) {
	        Node dummy = new Node(-1);  // dummy node
	        Node tail = dummy;

	        while (l1 != null && l2 != null) {
	            if (l1.data <= l2.data) {
	                tail.next = l1;
	                l1 = l1.next;
	            } else {
	                tail.next = l2;
	                l2 = l2.next;
	            }
	            tail = tail.next;  // move tail forward
	        }

	        // Attach remaining nodes
	        if (l1 != null) tail.next = l1;
	        if (l2 != null) tail.next = l2;

	        return dummy.next;  // skip dummy
	    }

	    private static void printList(Node head) {
	        while (head != null) {
	            System.out.print(head.data + " -> ");
	            head = head.next;
	        }
	        System.out.println("null");
	}

}
