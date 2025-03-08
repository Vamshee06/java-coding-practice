package org.basic.logics.streams.terminal.operations;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class FindFirst {

    public static void main(String[] args) {

        List<Integer> integerList = Arrays.asList(2,5,7,34,56,9);

        Optional<Integer> first = integerList.stream().filter(integer -> integer % 2 == 0)
                .findFirst();
        System.out.println(first.get());

        Optional<Integer> any = integerList.stream().filter(integer -> integer % 2 == 0)
                .findAny();
        System.out.println(any.get());
    }
}
