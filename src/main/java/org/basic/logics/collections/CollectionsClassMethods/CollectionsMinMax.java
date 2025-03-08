package org.basic.logics.collections.CollectionsClassMethods;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CollectionsMinMax {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10, 5, 30, 20, 15);

        int min = Collections.min(numbers);
        int max = Collections.max(numbers);

        System.out.println("Min: " + min);
        System.out.println("Max: " + max);
    }
}
