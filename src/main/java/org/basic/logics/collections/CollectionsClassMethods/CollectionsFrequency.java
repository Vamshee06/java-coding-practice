package org.basic.logics.collections.CollectionsClassMethods;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CollectionsFrequency {

    public static void main(String[] args) {
        List<String> list = Arrays.asList("apple", "banana", "apple", "cherry", "apple");

        int count = Collections.frequency(list, "apple");
        System.out.println("Frequency of 'apple': " + count);
    }

}
