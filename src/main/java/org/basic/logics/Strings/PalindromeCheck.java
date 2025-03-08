package org.basic.logics.Strings;

public class PalindromeCheck {

    public static boolean isPalindrome(String str) {
        return str.equals(new StringBuilder(str).reverse().toString());
    }

    public static void main(String[] args) {
        String str = "madam";
        System.out.println("Is Palindrome? " + isPalindrome(str));
    }

}
