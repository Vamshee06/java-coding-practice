package org.basic.logics.streams.terminal.operations;

import java.util.Arrays;
import java.util.List;

public class Sum {

    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(2,5,7,34,56,9,34,354);
        long sum = integerList.stream().mapToInt(Integer::intValue).sum();
        System.out.println("Sum of elements : "+sum);
    }

}
