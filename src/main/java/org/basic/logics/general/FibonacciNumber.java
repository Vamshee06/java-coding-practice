package org.basic.logics.general;

public class FibonacciNumber {

    static private long[] fibonacciCache;

    public static void main(String[] args) {
        int num = 4;
        fibonacciCache = new long[num + 1];
        for(int i=0; i<=num; i++){
            System.out.println(fibonacci(i) + " ");
        }
    }

    //With Recursion
    private static long fibonacci(int i) {
        if(i<=1){
            return  i;
        }
        if(fibonacciCache[i] != 0){
            return fibonacciCache[i];
        }
        long nthFibonacciNumber = (fibonacci(i -1) + fibonacci(i -2));
        fibonacciCache[i] = nthFibonacciNumber;
        return nthFibonacciNumber;
    }


    //Without Recursion
    static void fibonacciSeries(){
        int num= 10, firstNum = 0, secondNum = 1;
        for(int i=0; i<=num; i++) {
            System.out.print(firstNum + ", ");
            int nextNum = firstNum + secondNum;
            firstNum = secondNum;
            secondNum = nextNum;
        }
    }
}
