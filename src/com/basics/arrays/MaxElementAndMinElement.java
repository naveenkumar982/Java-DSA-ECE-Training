package com.basics.arrays;

import java.util.Arrays;

public class MaxElementAndMinElement {
    static void main(String[] args) {
        int[] array = {1, 6, -3, 7, 4};
        int mx = array[0];
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > mx) {
                mx = array[i];
            }

            if (array[i] < min) {
                min = array[i];
            }
        }
        System.out.println(Arrays.toString(array));
        System.out.println("Max:" + mx);
        System.out.println("Min:" + min);
    }
}
