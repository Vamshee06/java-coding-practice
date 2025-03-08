package org.basic.logics.streams.intermediate.operations;

import java.util.Arrays;
import java.util.List;

public class Filter {

    public static void main(String[] args) {
        //TODO Arrays.asList() method is used to prepare arrayLIst or list of array objects
        List<Integer> integerList = Arrays.asList(1,2,3,4,6,7);
        //Even Number
        integerList.stream().filter(eachElement -> eachElement % 2 == 0)
                .forEach(System.out::println);

        //Odd Number
        integerList.stream().filter(eachElement -> eachElement%2 !=0)
                .forEach(System.out::println);
    }
}
