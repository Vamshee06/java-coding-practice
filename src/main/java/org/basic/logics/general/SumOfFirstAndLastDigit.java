package org.basic.logics.general;

import java.util.Scanner;

public class SumOfFirstAndLastDigit {

    public static int sumFirstLast(int num) {
        int lastDigit = num % 10; // Extract last digit

        // Extract first digit
        while (num >= 10) {
            num /= 10;
        }
        int firstDigit = num;

        return firstDigit + lastDigit;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        scanner.close();

        System.out.println("Sum of First and Last Digit: " + sumFirstLast(number));
    }

}
