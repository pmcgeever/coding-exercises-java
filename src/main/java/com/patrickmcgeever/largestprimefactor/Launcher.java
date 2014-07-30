package com.patrickmcgeever.largestprimefactor;

import vanilla.java.collections.HugeArrayBuilder;
import vanilla.java.collections.api.HugeArrayList;

import java.util.*;

/**
 * Created by patrick on 13/07/2014.
 */
public class Launcher {

    public static void main(String[] args) {
//        Launcher obj = new Launcher();
//        Long target = 600851475143l;
//        Long largestPrimeFactor = obj.runEratosthenesSieve(target);
//        String answer = largestPrimeFactor != -1 ? largestPrimeFactor.toString() : "No prime factor for " + target;
//        System.out.println(answer);
    }

//    // Should be in reverse order for speed
//    public Set<Long> notPrimes;
//
//    Launcher() {
//        notPrimes = new TreeSet<>(Comparator.<Long>reverseOrder());
//    }
//
//    Long getLargestPrimeFactor(long target) {
//
//        long highestPrimeFactor = -1;
//
//        // Does not matter if the number is not divisible by 2 exactly
//        long halfTarget = target/2;
//
//        for( long i = 3; i<=halfTarget; i=i+2 ) {
//            if( isDivisible(target, i) ) {
//                if( isPrime(i) ) {
//                    highestPrimeFactor = i;
//                } else {
//                    notPrimes.add(i);
//                }
//            }
//        }
//
//        return highestPrimeFactor;
//    }
//
//    private boolean isPrime( long number ) {
//
//        if( isMultipleOfAnyExisingNonPrimes(number) ) {
//            notPrimes.add(number);
//            return false;
//        }
//
//        for( Long i = 3l; i<number/2; i=i+2 ) {
//            if (isDivisible(number, i)) {
//                notPrimes.add(number);
//                return false;
//            }
//        }
//        return true;
//    }
//
//    private boolean isMultipleOfAnyExisingNonPrimes(Long no) {
//
//        for( Long nonPrime : notPrimes ) {
//            if( isDivisible(no, nonPrime) ) {
//                return true;
//            }
//        }
//        return false;
//    }
//
//    private boolean isDivisible( long target, long number ) {
//        return target % number == 0;
//    }

    // NOT MY CODE
//    boolean[] isComposite;
//    HugeArrayList<Boolean> compos;
//
//    void runEratosthenesSieve(long upperBound) {
//
//        long upperBoundSquareRoot = (long) Math.sqrt(upperBound);
//
//        isComposite = new boolean[upperBound + 1];
//        compos = new HugeArrayBuilder<Boolean>().create();
//
//        for (int m = 2; m <= upperBoundSquareRoot; m++) {
//
//            if (!isComposite[m]) {
//
//                System.out.print(m + " ");
//
//                for (int k = m * m; k <= upperBound; k += m) {
//
//                    isComposite[k] = true;
//                }
//
//            }
//
//        }
//
//    }

}
