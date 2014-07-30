package com.patrickmcgeever.fibonaccievennumbers;

/**
 * Created by patrick on 13/07/2014.
 */
public class Launcher {

    public static void main(String[] args) {

        Launcher obj = new Launcher();

        System.out.println( obj.getSumOfEvenFibonacciNumbersUpto(4000000) );
    }

    long getSumOfEvenFibonacciNumbersUpto(int maxFibonacciNumber) {

        int nMinus2 = -1;
        int nMinus1 = -1;
        long sumOfEvenFibonacciNos = 0;

        while( nMinus1 <= maxFibonacciNumber ) {

            int currentFibonacciNo = getNextFibonacciNumber(nMinus2, nMinus1);

            if( isEven(currentFibonacciNo) ) {
                sumOfEvenFibonacciNos += currentFibonacciNo;
            }

            nMinus2 = nMinus1;
            nMinus1 = currentFibonacciNo;
        }
        return sumOfEvenFibonacciNos;
    }

    private boolean isEven(int number) {

        return number % 2 == 0;
    }

    private int getNextFibonacciNumber(int nMinus2, int nMinus1) {

        if( nMinus1 == -1 ) {
            return 1;
        }

        if( nMinus2 == -1 ) {
            return 2;
        }

        return nMinus1+nMinus2;
    }
}
