package com.basics.arrays;
//Varargs -> ... for an array {It internally uses arrays} //
public class E7 {
    public static void display (int... arr) {
        for (int n: arr){
            System.out.print(n+" ");
        }
        System.out.println();
    }

    static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5,6};
        display(arr1);
    }
}
