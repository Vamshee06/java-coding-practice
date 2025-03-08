package org.basic.logics.general;

import java.util.ArrayList;
import java.util.List;

public class ListToArray {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Java");
        list.add("Python");
        list.add("C++");

        // Convert List to Array
        String[] array = list.toArray(new String[0]);

        // Print Array
        System.out.println("Array Elements:");
        for (String item : array) {
            System.out.println(item);
        }
    }

}
