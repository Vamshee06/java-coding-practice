package org.basic.logics.general;

import java.util.Scanner;

public class LongestConsecutiveOccurrence {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = scanner.nextLine();
        scanner.close();

        char maxChar = str.charAt(0);
        int maxCount = 1, currentCount = 1;

        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == str.charAt(i - 1)) {
                currentCount++; // Increase count for consecutive characters
            } else {
                currentCount = 1; // Reset count if character changes
            }

            if (currentCount > maxCount) {
                maxCount = currentCount;
                maxChar = str.charAt(i);
            }
        }

        System.out.println("Longest Consecutive Character: '" + maxChar + "' appears " + maxCount + " times consecutively.");
    }

}
