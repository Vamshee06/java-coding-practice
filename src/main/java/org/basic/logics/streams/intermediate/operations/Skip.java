package org.basic.logics.streams.intermediate.operations;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Skip {

    public static void main(String[] args) {

        List<Integer> integerList = Arrays.asList(1,2,3,4,5,6,7);
        List<Integer> collected = integerList.stream().skip(3).collect(Collectors.toList());
        System.out.println(collected);
    }
}
