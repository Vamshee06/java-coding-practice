package org.basic.logics.general;

import java.util.Scanner;

public class PalindromeNumber {

    public static boolean isPalindrome(int number) {
        int original = number;
        int reversed = 0;

        while (number != 0) {
            int digit = number % 10; // Extract last digit
            reversed = reversed * 10 + digit; // Build reversed number
            number /= 10; // Remove last digit
        }

        return original == reversed;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        scanner.close();

        if (isPalindrome(number)) {
            System.out.println(number + " is a Palindrome");
        } else {
            System.out.println(number + " is NOT a Palindrome");
        }
    }

}
