package org.basic.logics.collections.collection.classes;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeExample {

    public static void main(String[] args) {
        Deque<String> deque = new ArrayDeque<>();
        deque.addFirst("Alice");
        deque.addLast("Bob");

        System.out.println("Deque: " + deque);
        System.out.println("Remove First: " + deque.removeFirst());
    }
}
