package com.patrickmcgeever.largestpalindrome;

/**
 * Created by patrick on 14/07/2014.
 */
public class Launcher {

    public static void main(String[] args) {
        Launcher obj = new Launcher();
        int largestPalindrome = obj.getLargestPalindromeFromProductOfTwoThreeDigitNumbers();
        if( largestPalindrome != -1 ) {
            System.out.println("The largest palindrome is " + largestPalindrome);
        } else {
            System.out.println("There is no palidrome");
        }
    }

    private int getLargestPalindromeFromProductOfTwoThreeDigitNumbers() {

        int largestPalindrome = -1;

        for( int i = 999; i>0; i-- ) {
            for (int n = 999; i > 0; n--) {
                int product = i * n;
//                if (isPalindrome(product)) {
//                    if (product > largestPalindrome) {
//                        largestPalindrome = product;
//                    }
//                }
            }
        }
        return largestPalindrome;
    }
}
