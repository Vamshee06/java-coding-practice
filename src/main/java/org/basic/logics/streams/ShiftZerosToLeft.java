package org.basic.logics.streams;

import java.util.Arrays;
import java.util.stream.IntStream;

public class ShiftZerosToLeft {

    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 3, 12, 0, 5};

        int[] result = IntStream.concat(
                Arrays.stream(arr).filter(n -> n == 0), // All zeros first
                Arrays.stream(arr).filter(n -> n != 0)  // Then non-zero elements
        ).toArray();

        System.out.println("Array after shifting zeros: " + Arrays.toString(result));
    }

}
