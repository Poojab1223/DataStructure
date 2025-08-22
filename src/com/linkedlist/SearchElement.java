package com.linkedlist;

import com.customLinkedList.Node;

public class SearchElement {
	public static void main(String[] args) {
		 Node<Integer> head = new  Node<Integer>(10);
        head.next = new  Node<Integer>(20);
        head.next.next = new  Node<Integer>(30);

        int key = 20;
        int position = searchKey(head, key);

        if (position != -1) {
            System.out.println("Found at position " + position);
        } else {
            System.out.println("Not Found");
        }
    }

    // Function to search for a key
    private static int searchKey( Node<Integer> head, int key) {
        int pos = 1;
         Node<Integer> curr = head;

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
