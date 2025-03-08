package org.basic.logics.collections.CollectionsClassMethods;

import java.util.Collections;
import java.util.List;

public class CollectionsUnmodifiable {

    public static void main(String[] args) {
        List<String> names = List.of("Alice", "Bob", "Charlie");
        List<String> unmodifiableList = Collections.unmodifiableList(names);

        System.out.println("Unmodifiable List: " + unmodifiableList);

        // Throws UnsupportedOperationException
        // unmodifiableList.add("David");
    }

}
