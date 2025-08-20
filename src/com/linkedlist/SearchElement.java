package com.linkedlist;

public class SearchElement {
	public static void main(String[] args) {
		Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);

        int key = 20;
        int position = searchKey(head, key);

        if (position != -1) {
            System.out.println("Found at position " + position);
        } else {
            System.out.println("Not Found");
        }
    }

    // Function to search for a key
    private static int searchKey(Node head, int key) {
        int pos = 1;
        Node curr = head;

        while (curr != null) {
            if (curr.data == key) {
                return pos;  // found
            }
            curr = curr.next;
            pos++;
        }
        return -1; // not found
	}

}
