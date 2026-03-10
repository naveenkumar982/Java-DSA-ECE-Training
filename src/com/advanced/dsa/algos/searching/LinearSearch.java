package com.advanced.dsa.algos.searching;

import java.util.Arrays;

public class LinearSearch {
    public static int LinearSearch(int[] arr, int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return i;
            }
        }
        return -1;
    }

    static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int key = 0;
        int index = LinearSearch(arr, key);
        if (index == -1) {
            System.out.println("Element not found in :" + Arrays.toString(arr));
        }else{
            System.out.println(key + " found at index " + index);
        }
    }
}
