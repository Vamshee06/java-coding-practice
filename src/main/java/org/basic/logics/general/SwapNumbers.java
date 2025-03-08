package org.basic.logics.general;

import java.util.Scanner;

public class SwapNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number (a): ");
        int a = scanner.nextInt();
        System.out.print("Enter second number (b): ");
        int b = scanner.nextInt();
        scanner.close();

        System.out.println("Before Swap: a = " + a + ", b = " + b);

        // Swapping without a third variable
        a = a + b; // Step 1: a now holds sum of a and b
        b = a - b; // Step 2: Subtract b from new a to get original a
        a = a - b; // Step 3: Subtract new b from new a to get original b

        System.out.println("After Swap: a = " + a + ", b = " + b);
    }

}
