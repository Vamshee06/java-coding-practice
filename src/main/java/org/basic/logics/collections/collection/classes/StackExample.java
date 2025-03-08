package org.basic.logics.collections.collection.classes;

import java.util.Stack;

public class StackExample {

    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        stack.push("Apple");
        stack.push("Banana");
        stack.push("Cherry");

        System.out.println("Stack: " + stack);
        System.out.println("Pop: " + stack.pop());
    }

}
