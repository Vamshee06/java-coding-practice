package org.basic.logics.Strings;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class RemoveDuplicatesFromEachWord {

    public static String removeDuplicates(String word) {
        LinkedHashSet<Character> uniqueChars = new LinkedHashSet<>();
        StringBuilder result = new StringBuilder();

        for (char c : word.toCharArray()) {
            if (uniqueChars.add(c)) {
                result.append(c);
            }
        }
        return result.toString();
    }

    public static String processString(String sentence) {
        String[] words = sentence.split("\\s+"); // Split by spaces
        StringBuilder result = new StringBuilder();

        for (String word : words) {
            result.append(removeDuplicates(word)).append(" ");
        }

        return result.toString().trim();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();
        scanner.close();

        System.out.println("Processed String: " + processString(sentence));
    }
}
