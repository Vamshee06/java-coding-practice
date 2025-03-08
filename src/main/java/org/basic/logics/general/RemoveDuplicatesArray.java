package org.basic.logics.general;

import java.util.Arrays;
import java.util.LinkedHashSet;

public class RemoveDuplicatesArray {

    public static int[] removeDuplicates(int[] arr) {
        LinkedHashSet<Integer> set = new LinkedHashSet<>();
        for (int num : arr) {
            set.add(num);
        }

        return set.stream().mapToInt(Integer::intValue).toArray();
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 1, 2, 4, 5, 6, 4};
        System.out.println("Original Array: " + Arrays.toString(arr));

        int[] uniqueArray = removeDuplicates(arr);
        System.out.println("Array after removing duplicates: " + Arrays.toString(uniqueArray));
    }
}
