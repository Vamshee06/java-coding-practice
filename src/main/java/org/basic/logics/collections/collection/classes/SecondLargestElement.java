package org.basic.logics.collections.collection.classes;

import java.util.Arrays;
import java.util.OptionalInt;
import java.util.Scanner;

public class SecondLargestElement {

    public static void withStreams() {
        int[] arr = {10, 20, 5, 30, 25};

        OptionalInt secondLargest = Arrays.stream(arr)
                .distinct() // Remove duplicates
                .sorted() // Sort the array
                .skip(arr.length - 2) // Skip to the second last element
                .findFirst(); // Get second largest

        System.out.println("Second Largest Element: " + (secondLargest.isPresent() ? secondLargest.getAsInt() : -1));
    }

    public static int findSecondLargest(int[] arr) {
        if (arr.length < 2) {
            throw new IllegalArgumentException("Array must have at least two elements");
        }

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num > largest) {
                secondLargest = largest; // Update second largest
                largest = num; // Update largest
            } else if (num > secondLargest && num != largest) {
                secondLargest = num; // Update second largest if it's smaller than the largest
            }
        }

        return secondLargest == Integer.MIN_VALUE ? -1 : secondLargest;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        int[] arr = new int[size];
        System.out.println("Enter " + size + " elements:");
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }
        scanner.close();

        int secondLargest = findSecondLargest(arr);
        System.out.println("Second Largest Element: " + secondLargest);
    }
}
