package com.basics.methods;

public class Example2 {
    static int sumOfNTerms(int n){
        return n * (n + 1) / 2;
    }
    public static void main(String[] args) {
        //first store and then print
        int sum = sumOfNTerms(10);
        //or directly say print it
        System.out.println(sumOfNTerms(100));
        System.out.println(sum);
    }
}
