package com.samilawson.bitcounting;

/**
 *  com.samilawson.bitcounting.BitCounting takes an integer and returns the number of 1's in its binary form
 *
 * @author  Sam Lawson
 *
 */
public class BitCounting {
    public BitCounting() {
    }

    /**
     * @param n an integer
     * @return the number of 1's in n's binary form
     */
    public int getBits(int n){
        return Integer.bitCount(n);
    }
}
