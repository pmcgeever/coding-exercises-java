package com.patrickmcgeever.recursivenfibinaccino;

/**
 * Created by patrick on 30/07/2014.
 */
public class FibonacciMethod1 {

    public static long fib(int n) {
      if( n <= 1 ) {
          return n;
      } else {
          return fib(n-1) + fib(n-2);
      }
    }
}
