package com.basics.methods;

public class Example5 {
    static int HammingWEIGHT(int n){
        int count = 0;
        while(n != 0){
            if((n&1)==1) {
                count++;
            }
            n = n>>1;
        }
        return count;
    }

    static void main(String[] args) {
        System.out.println("Hamming WEIGHT:" + HammingWEIGHT(7));
    }
}
