package org.basic.logics.collections.CollectionsClassMethods;

import java.util.TreeMap;

public class TreeMapExample {

    public static void main(String[] args) {
        TreeMap<Integer, String> map = new TreeMap<>();
        map.put(3, "Charlie");
        map.put(1, "Alice");
        map.put(2, "Bob");

        System.out.println("TreeMap (Sorted by Key): " + map);
    }
}
