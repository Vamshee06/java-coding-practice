package org.basic.logics.general;

import java.util.Scanner;

public class SwapStringsWithTemp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first string (str1): ");
        String str1 = scanner.nextLine();
        System.out.print("Enter second string (str2): ");
        String str2 = scanner.nextLine();
        scanner.close();

        System.out.println("Before Swap: str1 = " + str1 + ", str2 = " + str2);

        // Swapping using a temporary variable
        String temp = str1;
        str1 = str2;
        str2 = temp;

        System.out.println("After Swap: str1 = " + str1 + ", str2 = " + str2);
    }
}
