package com.basics.arrays;

import java.util.Arrays;

public class ArrayPartitioning {
    static void main(String[] args) {
        int[] arr = {9,8,5,12,7,6};
        System.out.println(Arrays.toString(arr));
        int left = 0;
        int right = arr.length-1;
        while(left<right){
            if(arr[left] % 2 == 0){
                left++;
            }
            if(arr[right] % 2 != 0){
                right--;
            }
          if(left<right){
              int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
          }
        }
        System.out.println(Arrays.toString(arr));
    }
}
