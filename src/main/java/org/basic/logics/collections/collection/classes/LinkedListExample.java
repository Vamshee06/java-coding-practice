package org.basic.logics.collections.collection.classes;

import java.util.LinkedList;

public class LinkedListExample {

    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("Alice");
        list.addFirst("Bob");
        list.addLast("Charlie");

        System.out.println("LinkedList: " + list);

        list.removeFirst();
        System.out.println("After removing first: " + list);
    }
}
