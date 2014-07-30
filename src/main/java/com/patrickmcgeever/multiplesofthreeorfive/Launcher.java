package com.patrickmcgeever.multiplesofthreeorfive;

/**
 * Created by patrick on 13/07/2014.
 */
public class Launcher {

    public static void main(String[] args) {

        Launcher obj = new Launcher();
        System.out.println(obj.getSumOfMultiplesOfThreeAndFive(1000));
    }

    long getSumOfMultiplesOfThreeAndFive(int target) {

        int nextMultiple = 2;
        long sumOfMultiplesOfThreeAndFiveUptoTarget = 0;

        while( nextMultiple != -1 ) {
            nextMultiple = getNextMultipleOfThreeOrFive (nextMultiple, target);
            if( nextMultiple != -1 ) {
                sumOfMultiplesOfThreeAndFiveUptoTarget += nextMultiple;
            }
        }
        return sumOfMultiplesOfThreeAndFiveUptoTarget;
    }

    private int getNextMultipleOfThreeOrFive(int currentNumber, int target) {

        int i = currentNumber + 1;
        if( i == target ) return -1;
        if( multipleOfThree(i) || multipleOfFive(i) ) return i;
        return getNextMultipleOfThreeOrFive(i, target);
    }

    private boolean multipleOfThree(int number) {

        return number % 3 == 0;
    }

    private boolean multipleOfFive(int number) {

        return number % 5 == 0;
    }

}
