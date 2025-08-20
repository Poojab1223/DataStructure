package com.linkedlist;

public class SortLinkedList {
	public static void main(String[] args) {
		Node head = new Node(4);
        head.next = new Node(2);
        head.next.next = new Node(1);
        head.next.next.next = new Node(3);

        System.out.print("Original List: ");
        printList(head);

        head = mergeSort(head);

        System.out.print("Sorted List: ");
        printList(head);
    }

    // Merge Sort function
    private static Node mergeSort(Node head) {
        if (head == null || head.next == null) {
            return head;
        }

        // 1. Split list into halves
        Node middle = getMiddle(head);
        Node nextOfMiddle = middle.next;
        middle.next = null; // break the list

        // 2. Sort each half
        Node left = mergeSort(head);
        Node right = mergeSort(nextOfMiddle);

        // 3. Merge sorted halves
        return mergeLists(left, right);
    }

    // Find middle using slow/fast pointer
    private static Node getMiddle(Node head) {
        Node slow = head, fast = head;
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    // Merge two sorted linked lists (like before)
    private static Node mergeLists(Node l1, Node l2) {
        Node dummy = new Node(-1);
        Node tail = dummy;

        while (l1 != null && l2 != null) {
            if (l1.data <= l2.data) {
                tail.next = l1;
                l1 = l1.next;
            } else {
                tail.next = l2;
                l2 = l2.next;
            }
            tail = tail.next;
        }
        if (l1 != null) tail.next = l1;
        if (l2 != null) tail.next = l2;

        return dummy.next;
    }

    private static void printList(Node head) {
        while (head != null) {
            System.out.print(head.data + " -> ");
            head = head.next;
        }
        System.out.println("null");
    
	}

}
