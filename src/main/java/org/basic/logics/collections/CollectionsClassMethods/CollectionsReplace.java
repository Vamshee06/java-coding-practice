package org.basic.logics.collections.CollectionsClassMethods;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsReplace {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>(List.of("apple", "banana", "apple", "cherry"));

        Collections.replaceAll(list, "apple", "grape");
        System.out.println("Modified List: " + list);
    }

}
