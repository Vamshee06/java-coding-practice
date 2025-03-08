package org.basic.logics.general;

import java.util.Scanner;

public class ReverseNumber {

    public static void reverseWithMathematicalApproach() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        scanner.close();

        int reversed = 0;
        while (number != 0) {
            int digit = number % 10; // Extract last digit
            reversed = reversed * 10 + digit; // Build reversed number
            number /= 10; // Remove last digit
        }

        System.out.println("Reversed Number: " + reversed);
    }

    public static void reverseWithStringBuilder() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        scanner.close();

        String reversed = new StringBuilder(String.valueOf(number)).reverse().toString();
        System.out.println("Reversed Number: " + reversed);
    }

    public static int reverse(int num, int reversed) {
        if (num == 0) return reversed;
        return reverse(num / 10, reversed * 10 + num % 10);
    }

    public static void reverseNumberWithRecursion(String[] args) {
        int number = 9876;
        int reversedNumber = reverse(number, 0);
        System.out.println("Reversed Number: " + reversedNumber);
    }

    public static int reverseNumber(int num) {
        int sign = num < 0 ? -1 : 1;
        num = Math.abs(num);
        int reversed = 0;

        while (num != 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }
        return reversed * sign; // Restore original sign
    }

    public static void main(String[] args) {

        //reverseWithMathematicalApproach();
        //reverseWithStringBuilder();
        int number = 9876;
        int reversedNumber = reverse(number, 0);
        System.out.println("Reversed Number: " + reversedNumber);

        int negativeNumber = -1234;
        System.out.println("Reversed Number: " + reverseNumber(negativeNumber));
    }
}
