package com.basics.arrays;

public class E1 {
    public static void main(String[] args) {
        int[] arr;//Declaration
        arr=new int[5];//Memory allocation [20 Bytes] [4bytes x 5 blocks]
        System.out.println(arr[4]);
        //if we do not provide any values, the JVM uses "FALLBACK MECHANISM"
        //It uses the default values of that particular data type
        //int -> 0, float ->0.0,String -> null, boolean->false, char->null
        //Declaration & Memory Allocation in single line
        int [] arr2 = new int[5];
        System.out.println(arr2[4]);
        int [] arr3 = {1,2,3,4,5};
        System.out.println(arr3[4]);
        //method 4
        int [] arr4 = new int[] {1,2,3,4,5};
        System.out.println(arr4[0]);
    }
}
