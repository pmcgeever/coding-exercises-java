package com.patrickmcgeever.recursivenfibinaccino;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by patrick on 30/07/2014.
 */
public class FibonacciMethod2 {

    public static long fib(int n) {
        if( n <= 1 ) {
            return n;
        }
        List<Long> fibs = new ArrayList<>(n);
        fibs.add(0l);
        fibs.add(1l);
        return fib(fibs, n);
    }

    private static long fib( List<Long> fibs, int n ) {

        if( fibs.size() == n ) {
            return fibs.get(n-1);
        }

        long a = fibs.get(fibs.size()-1);
        long b = fibs.get(fibs.size()-2);

        fibs.add( a+b );

        return fib(fibs, n);
    }

    public static long fib2(int n) {
        if( n <= 1 ) {
            return n;
        }
        return fib2( 0l, 1l, 2, n );
    }

    private static long fib2( long lastlastFib, long lastFib, int pos, int n ) {

        if(pos == n ) {
            return lastFib;
        }
        long fib = lastFib+lastlastFib;
        pos++;
        return fib2( lastFib, fib, pos, n );
    }

}
