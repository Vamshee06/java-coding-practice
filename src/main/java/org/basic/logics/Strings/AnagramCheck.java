package org.basic.logics.Strings;

import java.util.Arrays;

public class AnagramCheck {

    public static boolean isAnagram(String str1, String str2) {
        char[] arr1 = str1.replaceAll("\\s", "").toLowerCase().toCharArray();
        char[] arr2 = str2.replaceAll("\\s", "").toLowerCase().toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        return Arrays.equals(arr1, arr2);
    }

    public static void main(String[] args) {
        System.out.println("Are 'listen' and 'silent' Anagrams? " + isAnagram("listen", "silent"));
    }

}
