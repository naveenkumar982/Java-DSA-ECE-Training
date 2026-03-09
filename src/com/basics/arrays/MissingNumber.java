package com.basics.arrays;

public class MissingNumber {
    public static void main(String[] args) {
        int[] arr = {1,2,4,5};
        int n = arr.length + 1;
        int totalSum = n*(n+1)/2;
        int arraysum = 0;
        for(int num : arr){
            arraysum += num;
        }
        System.out.println("Array sum: "+arraysum);
        int missingSum = totalSum-arraysum;
        System.out.println("Missing number: "+missingSum);
    }
}
