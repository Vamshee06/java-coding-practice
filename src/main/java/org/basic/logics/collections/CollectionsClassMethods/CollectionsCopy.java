package org.basic.logics.collections.CollectionsClassMethods;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CollectionsCopy {

    public static void main(String[] args) {
        List<String> source = Arrays.asList("A", "B", "C");
        List<String> dest = new ArrayList<>(Arrays.asList("X", "Y", "Z"));

        Collections.copy(dest, source);
        System.out.println("Destination List After Copy: " + dest);
    }
}
