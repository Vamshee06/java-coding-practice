package org.basic.logics.Strings;

public class RemoveWhiteSpaces {

    public static void main(String[] args) {
        String str = "  Hello   World  ";
        String noSpaces = str.replaceAll("\\s", "");
        System.out.println("Without Spaces: " + noSpaces);
    }

}
