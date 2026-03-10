package com.advanced.dsa.algos.sorting;

import java.util.Arrays;

public class InsertionSort {
    public static void insertionsort(int arr[]){
        for(int i=1;i<arr.length;i++){
            int temp=arr[i];
            int j=i-1;
            while(j>=0&&arr[j]>temp){
                //Shift Operation
                arr[j+1]=arr[j];
                j--;//Occupies the empty box[]
            }
            arr[j+1]=temp;
        }
    }

    static void main(String[] args) {
        int[] arr = {4,3,1,5,7,9,0};
        System.out.println(Arrays.toString(arr));
        insertionsort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
