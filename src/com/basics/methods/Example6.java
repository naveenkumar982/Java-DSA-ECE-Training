package com.basics.methods;

import java.util.Scanner;

public class Example6 {
    static int ReverseInteger(int n) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int rev = 0;
        while (n > 0) {
            int digit = n % 10;
            rev = rev * 10 + digit;
            n = n / 10;
        }
        return rev;
    }

    static void main(String[] args) {
        System.out.println(ReverseInteger(210));
    }
    }
