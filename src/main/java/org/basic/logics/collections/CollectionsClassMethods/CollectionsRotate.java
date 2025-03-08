package org.basic.logics.collections.CollectionsClassMethods;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CollectionsRotate {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>(Arrays.asList("A", "B", "C", "D", "E"));

        Collections.rotate(list, 2); // Moves last 2 elements to the front
        System.out.println("Rotated List: " + list);
    }
    
}
