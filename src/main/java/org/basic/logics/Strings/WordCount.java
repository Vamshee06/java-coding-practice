package org.basic.logics.Strings;

public class WordCount {

    public static void main(String[] args) {
        String str = "Java is powerful and fun";
        String[] words = str.split("\\s+"); // Splitting by spaces
        System.out.println("Word Count: " + words.length);
    }

}
