package com.basics.methods.recursion;

public class SumOfNterms {
    public static int sum(int n){
        if(n==0){
            return 0;
        }
        return n +sum(n-1);
    }

    static void main(String[] args) {
        System.out.println(sum(7));
    }
}
