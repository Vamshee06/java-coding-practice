package org.basic.logics.streams.intermediate.operations;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Map {

    public static void main(String[] args) {
        /** Map method is used to map(apply rule) the elements of the Stream
        Arrays.asList() method is used to prepare arrayLIst or list of array objects */

        List<String> strings = Arrays.asList("Vamshee", "Prashanthi", "Teju", "Aahil");
        strings.stream().map(eachString -> eachString.toUpperCase())
                .forEach(System.out::println);

        /** Alternatively we can use method references in place of Lambda expression.
        Pass the type of the element instead of element itself */

        strings.stream().map(String::toUpperCase).forEach(System.out::println);
    }
}
