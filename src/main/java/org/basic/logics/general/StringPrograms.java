package org.basic.logics.general;

public class StringPrograms {

    public static void main(String[] args) {
        reverseString();
        reverseWordsInOrder();
    }

    private static void reverseString() {
        String str = "This is Vamshee";
        String reverseStr = "";
        for(int i=str.length()-1; i>=0; i--){
            reverseStr += str.charAt(i);
        }
        System.out.println("Reverse String : "+ reverseStr);
    }

    private static void reverseWordsInOrder() {
        String str = "This is Vamshee";
        String[] strs = str.split(" ");
        for(String eachStr : strs) {
            String reverseStr = "";
            for (int i = eachStr.length()-1; i >= 0; i--) {
                reverseStr += eachStr.charAt(i);
            }
            System.out.print(reverseStr + " ");
        }

    }
}
