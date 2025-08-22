package com.linkedlist;

import com.customLinkedList.Node;

public class ReverseLinkedList {
	public static void main(String[] args) {
		Node<Integer> head = new Node<Integer>(1);
		head.next = new Node<Integer>(2);
		head.next.next = new Node<Integer>(3);
		head.next.next.next = new Node<Integer>(4);

		System.out.print("Original List: ");
		printList(head);

		head = reverseList(head);

		System.out.print("Reversed List: ");
		printList(head);
	}

	// Iterative method
	private static Node<Integer> reverseList(Node<Integer> head) {
		Node<Integer> prev = null;
		Node<Integer> curr = head;
		Node<Integer> next;

		while (curr != null) {
			next = curr.next;    
			curr.next = prev;    
			prev = curr;         
			curr = next;         
		}
		return prev;  
	}

	private static void printList(Node<Integer> head) {
		while (head != null) {
			System.out.print(head.data + " -> ");
			head = head.next;
		}
		System.out.println("null");
	}


}
