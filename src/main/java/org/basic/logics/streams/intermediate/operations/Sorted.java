package org.basic.logics.streams.intermediate.operations;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Sorted {

    public static void main(String[] args) {
        //sortedAscendingAndDescendingOrder();
        sortWordsByLength();
    }

    private static void sortedAscendingAndDescendingOrder() {
        List<Integer> integerList = Arrays.asList(3,5,8,2,6);

        // Natural order - Ascending
        integerList.stream().sorted().forEach(System.out::println);

        // Reverse order - Descending
        integerList.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
    }

    private static void sortWordsByLength()
    {
        List<String> strings = Arrays.asList("cat", "donkey", "cheetah", "dog", "deer", "lion" );

        List<String> list = strings.stream().sorted(Comparator.comparingInt(String::length)).toList();
        System.out.println(list);

        Map<Integer, List<String>> integerListMap = list.stream().collect(Collectors.groupingBy(String::length));
        System.out.println(integerListMap);
    }
}
