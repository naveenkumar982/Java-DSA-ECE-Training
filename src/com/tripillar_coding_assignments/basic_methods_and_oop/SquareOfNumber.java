package com.tripillar_coding_assignments.basic_methods_and_oop;

import java.util.Scanner;

public class SquareOfNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = input.nextInt();
        System.out.println("Square of number is: " + n*n);
    }
}
