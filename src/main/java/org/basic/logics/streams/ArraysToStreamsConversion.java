package org.basic.logics.streams;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ArraysToStreamsConversion {

    public static void main(String[] args) {

        // Primitive types
        //Arrays.Streams() method is used to convert Arrays to Streams
        int[] primitive = {1,2,3,4};
        IntStream stream = Arrays.stream(primitive);
        stream.forEach(System.out:: println);

        //Wrapper class
        //Stream.of() method is used to convert Array Objects to Streams
        Integer[] wrappers  = new Integer[]{1,2,3,4,5,6};
        Stream stream1 = Stream.of(wrappers);
        stream1.forEach(System.out::println);
    }
}
