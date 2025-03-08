package org.basic.logics.streams.intermediate.operations;

import java.util.Arrays;
import java.util.List;

public class Distinct {

    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(1,2,2,4,5,6,6,7);
        integerList.stream().distinct().forEach(System.out::println);
    }
}
