package org.basic.logics.streams;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class ShiftZerosToRight {

    public static void withStreams(String[] args) {
        int[] arr = {0, 1, 0, 3, 12, 0, 5};

        int[] result = IntStream.concat(
                Arrays.stream(arr).filter(n -> n != 0),
                Arrays.stream(arr).filter(n -> n == 0)
        ).toArray();

        System.out.println("Array after shifting zeros: " + Arrays.toString(result));
    }

    public static void shiftZeros(int[] arr) {
        int index = 0; // Pointer for non-zero elements

        // Move all non-zero elements to the front
        for (int num : arr) {
            if (num != 0) {
                arr[index++] = num;
            }
        }

        // Fill remaining positions with zeros
        while (index < arr.length) {
            arr[index++] = 0;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int size = scanner.nextInt();

        int[] arr = new int[size];
        System.out.println("Enter " + size + " elements:");
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }
        scanner.close();

        System.out.println("Original Array: " + Arrays.toString(arr));
        shiftZeros(arr);
        System.out.println("Array after shifting zeros: " + Arrays.toString(arr));
    }

}
