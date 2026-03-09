package com.basics.arrays;

public class E5 {
    //How to pass an array to method(function)
    public static void printArray(int[] arr){
        for (int x : arr) {
            System.out.print(x + " ");
        }
        System.out.println();
    }
    public static int[] createArray(){// will return an array of integers
        return new int[]{1,2,3,4,5};//new array created and returned

    }

    static void main(String[] args) {
     int[] arr = {1,2,3,4,5,6};
     printArray(arr);
     int[] result = createArray();
     for (int x : result) {
         System.out.print(x + " ");
     }
     System.out.println();
     printArray(new int[] {1,2,3,4,5,6});//This is called Anonymous array -> it is directly called in method call()
        //After the method call, we cannot access the array elements
    }
}
