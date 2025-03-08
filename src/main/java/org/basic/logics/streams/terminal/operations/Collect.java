package org.basic.logics.streams.terminal.operations;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Collect {

    public static void main(String[] args) {

        List<Integer> integerList = Arrays.asList(1,3,5,6,8,2);

        List<Integer> collected = integerList.stream().filter(integer -> integer % 2 == 0)
                .map(integer -> integer * integer)
                .collect(Collectors.toList());
        collected.stream().forEach(System.out::println);
        collected.forEach(System.out::println);
    }
}
