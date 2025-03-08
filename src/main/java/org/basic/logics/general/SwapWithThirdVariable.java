package org.basic.logics.general;

import java.util.Scanner;

public class SwapWithThirdVariable {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number (a): ");
        int a = scanner.nextInt();
        System.out.print("Enter second number (b): ");
        int b = scanner.nextInt();
        scanner.close();

        System.out.println("Before Swap: a = " + a + ", b = " + b);

        // Swapping using a third variable
        int temp = a;
        a = b;
        b = temp;

        System.out.println("After Swap: a = " + a + ", b = " + b);
    }

}
