package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Basic {
    public static void main(String[] args) throws InterruptedException {
        //System.out.println("End result : "+factorial(4));
        //factorial1();
        }

//Recursion method - factorial of 5 = 5*4*3*2*1=120
    static int factorial(int num) throws InterruptedException {
        System.out.println("Number : "+ num);
        return  (num == 0) ? 1  : num * factorial(num - 1);
    }

    //Fibonacci Series - 0, 1, 1, 2, 3, 5, 8, 13, 21


    static void fibonacciSeriesUsingRecursion() {
        int num = 5;
        long[] fibonacciCache = new long[num+1];

    }


 public static int factorial1()
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