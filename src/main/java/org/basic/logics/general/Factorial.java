package org.basic.logics.general;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) throws InterruptedException {
        //System.out.println("End result : "+factorialWithRecursion(4));
        //factorial();
        }

//Recursion method - factorial of 5 = 5*4*3*2*1=120
    static int factorialWithRecursion(int num) throws InterruptedException {
        System.out.println("Number : "+ num);
        return  (num == 0) ? 1  : num * factorialWithRecursion(num - 1);
    }


 public static int factorial()
 {
     System.out.println("Enter a number   \n");
     Scanner scanner  =new Scanner(System.in);
     int number = scanner.nextInt();
     int result = 1;
     if (number == 0) {
         System.out.println("Result: "+ result);
         return 1;
     }else{
         for(int i=1; i<=number;i++){
             result = result * i;
         }
         System.out.println("Result: "+ result);
     }
     return result;
 }

}