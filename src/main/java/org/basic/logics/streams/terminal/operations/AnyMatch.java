package org.basic.logics.streams.terminal.operations;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class AnyMatch {

    public static void main(String[] args) {

        List<Integer> integerList = Arrays.asList(2,5,7,34,56,9);

        boolean matchInd = integerList.stream().anyMatch(integer -> integer % 6 == 0);
        System.out.println(matchInd);

    }
}
