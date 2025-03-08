package org.basic.logics.streams.terminal.operations;

import java.util.Arrays;
import java.util.List;

public class Count {

    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(2,5,7,34,56,9,34,354);
        long count = integerList.stream().count();
        System.out.println("Number of elements : "+count);
    }
}
