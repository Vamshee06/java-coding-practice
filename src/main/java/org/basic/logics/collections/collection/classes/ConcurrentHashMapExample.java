package org.basic.logics.collections.collection.classes;

import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapExample {

    public static void main(String[] args) {
        ConcurrentHashMap<Integer, String> map = new ConcurrentHashMap<>();
        map.put(1, "Alice");
        map.put(2, "Bob");

        System.out.println("ConcurrentHashMap: " + map);
    }

}
