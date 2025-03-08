package org.basic.logics.collections.collection.classes;

import java.util.TreeSet;

public class TreeSetExample {

    public static void main(String[] args) {
        TreeSet<Integer> set = new TreeSet<>();
        set.add(30);
        set.add(10);
        set.add(20);

        System.out.println("TreeSet (Sorted): " + set);
        System.out.println("First Element: " + set.first());
        System.out.println("Last Element: " + set.last());
    }
}
