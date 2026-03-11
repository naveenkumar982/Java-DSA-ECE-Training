package com.advanced.dsa.algos;

public class KadaneAlgo {
    static int kadaneAlgo(int[] arr){
        int gMax  = arr[0];
        int cMax = arr[0];
        for (int i = 1; i < arr.length; i++){
            cMax = Math.max(arr[i],cMax + arr[i]);
            gMax = Math.max(gMax,cMax);
        }
        return gMax;
    }

    static void main(String[] args) {
        int[] arr = {5,-8,1,2,-1,4};
        System.out.println("Maximum Subarray sum is: " +kadaneAlgo(arr));
        int[] arr2 = {-2,-3,-8,-5,0};
        System.out.println("Maximum Subarray sum is: " +kadaneAlgo(arr2));
    }
}
