package org.basic.logics.collections.CollectionsClassMethods;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsSort {

    public static void main(String[] args) {
        List<String> names = new ArrayList<>(List.of("Alice", "Charlie", "Bob"));

        // Sorting in natural order (ascending)
        Collections.sort(names);
        System.out.println("Sorted List: " + names);

        // Sorting in reverse order
        Collections.sort(names, Collections.reverseOrder());
        System.out.println("Reverse Sorted List: " + names);
    }
}
