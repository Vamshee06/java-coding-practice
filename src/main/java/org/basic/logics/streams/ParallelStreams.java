package org.basic.logics.streams;


import java.util.stream.LongStream;

/**
 * If heavy computations are involved go for Parallel Streams otherwise go with sequential streams
 * .parallel() method makes the streams parallel
 */
public class ParallelStreams {

    // Factorial using Sequential Stream
    public static long factorialSequential(long n) {
        return LongStream.rangeClosed(1, n)
                .reduce(1, (a, b) -> a * b);
    }

    // Factorial using Parallel Stream
    public static long factorialParallel(long n) {
        return LongStream.rangeClosed(1, n)
                .parallel()  // Enable parallel processing
                .reduce(1, (a, b) -> a * b);
    }

    public static void main(String[] args) {
        long number = 40; // Change this value for testing

        // Compute factorial using Sequential Stream
        long startSequential = System.nanoTime();
        long factorialSeq = factorialSequential(number);
        long endSequential = System.nanoTime();
        System.out.println("Sequential Factorial of " + number + " = " + factorialSeq);
        System.out.println("Time taken (Sequential): " + (endSequential - startSequential) / 1_000_000 + " ms");

        // Compute factorial using Parallel Stream
        long startParallel = System.nanoTime();
        long factorialPar = factorialParallel(number);
        long endParallel = System.nanoTime();
        System.out.println("Parallel Factorial of " + number + " = " + factorialPar);
        System.out.println("Time taken (Parallel): " + (endParallel - startParallel) / 1_000_000 + " ms");
    }
}
