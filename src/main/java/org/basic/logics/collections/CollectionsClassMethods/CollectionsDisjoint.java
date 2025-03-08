package org.basic.logics.collections.CollectionsClassMethods;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CollectionsDisjoint {

    public static void main(String[] args) {
        List<String> list1 = Arrays.asList("apple", "banana", "cherry");
        List<String> list2 = Arrays.asList("grape", "mango", "kiwi");

        boolean isDisjoint = Collections.disjoint(list1, list2);
        System.out.println("Are the lists disjoint? " + isDisjoint);
    }

}
