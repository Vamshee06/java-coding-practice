package org.basic.logics.streams.terminal.operations;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class MinAndMax {

    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(5,7,34,78,90);
        Optional<Integer> min = integerList.stream().min(Comparator.naturalOrder());
        System.out.println(min.get());

        Optional<Integer> max = integerList.stream().max(Comparator.naturalOrder());
        System.out.println(max.get());
    }
}
