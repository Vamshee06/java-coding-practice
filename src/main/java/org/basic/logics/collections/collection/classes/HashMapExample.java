package org.basic.logics.collections.collection.classes;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {

    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Alice");
        map.put(2, "Bob");
        map.put(3, "Charlie");

        System.out.println("HashMap: " + map);

        map.remove(2);
        System.out.println("After removing key 2: " + map);
    }
}
