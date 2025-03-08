package org.basic.logics.Strings;

import java.util.HashMap;
import java.util.Map;

public class DuplicateCharacters {

    public static void main(String[] args) {
        String str = "programming";
        Map<Character, Integer> charCount = new HashMap<>();

        for (char c : str.toCharArray()) {
            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
        }

        System.out.println("Duplicate Characters:");
        charCount.forEach((key, value) -> {
            if (value > 1) System.out.println(key + ": " + value);
        });
    }

}
