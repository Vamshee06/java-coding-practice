package org.basic.logics.streams.terminal.operations;

import java.util.Arrays;
import java.util.List;

public class Reduce {

    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(1,2,5,6,7,9);
        /** Reduce -  will generate one element from collection of elements
        First param: Identity - the element with which the operation starts */

        Integer reducedAdditionValue = integerList.stream().reduce(0, ((a, b) -> a + b));
        System.out.println(reducedAdditionValue);

        Integer reducedMultipliedValue = integerList.stream().reduce(1, ((a, b) -> a * b));
        System.out.println(reducedMultipliedValue);
    }
}
