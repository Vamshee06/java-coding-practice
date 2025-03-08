package org.basic.logics.collections.collection.classes;

import java.util.ArrayList;
import java.util.List;

public class ListSetAndGetExample {

    public static void main(String[] args) {
        // Create a List
        List<String> list = new ArrayList<>();
        list.add("Java");
        list.add("Python");
        list.add("C++");

        // Get an element at index 1
        System.out.println("Element at index 1: " + list.get(1)); // Python

        // Modify an element at index 2
        list.set(2, "JavaScript");
        System.out.println("Updated List: " + list);
    }

}
