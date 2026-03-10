package com.advanced.dsa.algos.sorting;

import java.util.Arrays;

public class BubbleSort {
    public static void bubblesort(int[] arr) {//No of iterations (n-1)
        int n = arr.length;
        for (int i = 1; i < n ; i++) {
            for (int j = 0; j < n - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    //Swap arr[j] & arr[j+1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
    static void main(String[] args) {
        int [] arr = {5,4,3,7,8,2,1};
        System.out.println(Arrays.toString(arr));
        bubblesort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
