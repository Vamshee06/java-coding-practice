package org.basic.logics.Strings;

public class SwapFirstLastChar {

    public static void main(String[] args) {
        String str = "hello world";
        String[] words = str.split(" ");
        StringBuilder result = new StringBuilder();

        for (String word : words) {
            if (word.length() > 1) {
                result.append(word.charAt(word.length() - 1))  // Last character
                        .append(word, 1, word.length() - 1)     // Middle part
                        .append(word.charAt(0)).append(" ");    // First character
            } else {
                result.append(word).append(" ");
            }
        }

        System.out.println("Modified String: " + result.toString().trim());
    }

}
