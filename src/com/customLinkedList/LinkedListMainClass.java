package com.customLinkedList;

public class LinkedListMainClass {
	public static void main(String[] args) {
        CustomLinkedList list = new CustomLinkedList();

        list.addFirst(10);
        list.addLast(20);
        list.addLast(30);
        list.insertAt(1, 15); // insert at index 1

        list.printList(); // 10 → 15 → 20 → 30 → null

        list.deleteFirst();
        list.printList(); // 15 → 20 → 30 → null

        list.deleteLast();
        list.printList(); // 15 → 20 → null

        list.deleteAt(0);
        list.printList(); // 20 → null

        System.out.println("Element at index 0: " + list.get(0)); // 20
        System.out.println("Size: " + list.size()); // 1
    }
}
