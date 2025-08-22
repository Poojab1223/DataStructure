package com.linkedlist;

import com.customLinkedList.Node;

public class MergerSortedList {
	public static void main(String[] args) {
		Node<Integer> l1 = new Node<>(1);
        l1.next = new Node<>(3);
        l1.next.next = new Node<>(5);

        Node<Integer> l2 = new Node<>(2);
        l2.next = new Node<>(4);
        l2.next.next = new Node<>(6);

        Node<Integer> merged = mergeLists(l1, l2);

        System.out.print("Merged List: ");
        printList(merged);
    }

    // merge two sorted linked lists
    private static Node<Integer> mergeLists(Node<Integer> l1, Node<Integer> l2) {
        Node<Integer> dummy = new Node<>(-1);  // dummy node
        Node<Integer> tail = dummy;

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

    private static void printList(Node<Integer> head) {
        while (head != null) {
            System.out.print(head.data + " -> ");
            head = head.next;
        }
        System.out.println("null");
    }
}
