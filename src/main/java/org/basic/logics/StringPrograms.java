package org.basic.logics;

public class ReverseString {

    public static void main(String[] args) {
        String str = "This is Vamshee";
        String reverseStr = "";
        for(int i=str.length()-1; i>=0; i--){
            reverseStr += str.charAt(i);
        }
        System.out.println("Reverse String : "+ reverseStr);
    }
}
