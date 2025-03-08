package org.basic.logics.Strings;

import java.util.Scanner;

public class CountCapitalizedWords {

    public static int countCapitalizedWords(String str) {
        String[] words = str.split("\\s+"); // Split words by spaces
        int count = 0;

        for (String word : words) {
            if (!word.isEmpty() && Character.isUpperCase(word.charAt(0))) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();
        scanner.close();

        int capitalizedCount = countCapitalizedWords(sentence);
        System.out.println("Number of Capitalized Words: " + capitalizedCount);
    }

}
