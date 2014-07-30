package com.patrickmcgeever.recursivenfibinaccino;

/**
 * Created by patrick on 30/07/2014.
 */
public class Launcher {
    public static void main( String[] args ) {
        int n = 50;

        long start1 = System.nanoTime();
        long fibMethod1 = FibonacciMethod1.fib(n);
        long duration1 = System.nanoTime() - start1;

        long start2 = System.nanoTime();
        long fibMethod2 = FibonacciMethod2.fib(n);
        long duration2 = System.nanoTime() - start2;

        long start2_2 = System.nanoTime();
        long fibMethod2_2 = FibonacciMethod2.fib2(n);
        long duration2_2 = System.nanoTime() - start2_2;

        System.out.println("n is: " + n + " calculated fib for method 1 is: " + fibMethod1 + " time to complete method 1 is: " + duration1 );
        System.out.println("n is: " + n + " calculated fib for method 2 is: " + fibMethod2 + " time to complete method 2 is: " + duration2 );
        System.out.println("n is: " + n + " calculated fib for method 2_2 is: " + fibMethod2_2 + " time to complete method 2_2 is: " + duration2_2 );

    }
}
