package org.basic.logics.streams.intermediate.operations;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Peek {

    public static void main(String[] args) throws InterruptedException {
        List<Integer> integerList = Arrays.asList(3,4,5,6);
       List<Integer> collected = integerList.stream()
        .peek(System.out::println)
               .map(eachElement -> (eachElement * eachElement))
                //.peek(System.out::println)
                .collect(Collectors.toList());
        System.out.println(collected);
     }
}
