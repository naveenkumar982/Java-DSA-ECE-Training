package com.advanced.dsa.algos.searching;

import java.util.Arrays;

public class BinarySearch {
    public static int BinarySearch (int[] arr, int key){
        int low = 0;
        int high = arr.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;  //   Or (low+high)/2
            if (arr[mid] == key) {
                return mid;
            }else if (arr[mid] < key) {
                low = mid + 1;
            }
            else if (arr[mid] > key) {
                high = mid - 1;
            }
        }
        return -1;
    }

    static void main(String[] args) {
        int[] arr = {2,3,7,8,19,21,45,89};
        int key = 19;
        int index = BinarySearch(arr, key);
        if (index == -1) {
            System.out.println("Element not found in :" + Arrays.toString(arr));
        }else  {
            System.out.println(key + " found at index :" + index);
        }
    }
}
