package org.basic.logics.collections.collection.classes;

import java.util.*;

public class HashSetExample {

    public static void main(String[] args) {
        Set<Integer> numbers = new HashSet<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(10); // Duplicate won't be added

        System.out.println("HashSet: " + numbers);
    }
}
