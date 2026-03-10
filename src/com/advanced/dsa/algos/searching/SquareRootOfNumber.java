package com.advanced.dsa.algos.searching;

public class SquareRootOfNumber {
    public static int squareRoot(int n) {
        int start = 0;
        int end = n;
        while (start <= end) {
            int mid = start + (end - start) / 2;  //   Or (start+end)/2
            if (mid * mid == n) {
                return mid;
            } else if (mid * mid < n) {
                start = mid + 1;
            } else if (mid * mid > n) {
                end = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int key = 100;
        int result = squareRoot(key);
        if (result == -1) {
            System.out.println("Not Found");
        }else  {
            System.out.println("the square root of " + key + " is:" +  result);
        }
    }
}