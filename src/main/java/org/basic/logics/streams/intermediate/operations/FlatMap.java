package org.basic.logics.streams.intermediate.operations;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Stream;

public class FlatMap {

    public static void main(String[] args) {
        /** FlatMap is used to flatten the complex data structures like List of lists */

        List<List<String>> listOfLists = Arrays.asList(
              Arrays.asList("a", "b"),
                Arrays.asList("c", "d"),
                Arrays.asList("x", "z")
        );
        Stream<String> stringStream = listOfLists.stream().flatMap(Collection::stream).map(String::toUpperCase);
        stringStream.forEach(System.out::println);
    }
}
