package com.advanced.dsa.algos.searching;

public class MaxMinIntegerValues {
    public static void main(String[] args) {
        System.out.println("Max Integer Value: " + Integer.MAX_VALUE);
        System.out.println("Min Integer Value: " + Integer.MIN_VALUE);
        System.out.println("Max Integer value +1: " + (Integer.MIN_VALUE +1));
        System.out.println("Min Integer value -1: " + (Integer.MIN_VALUE -1));
        /*
        s = max_value
        e = max_value
        if the formula is (s+e)/2 -> then we get  (-ve output that is out of bound)
        so the optimum formula is -> s + (e-s)/2
         */
    }
}
