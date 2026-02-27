package com.tripillar_coding_assignments.conditions_and_loops;

import java.util.Scanner;

public class MultiplicationTableOfGivenNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number:");
        int n = sc.nextInt();
            for (int i = 1; i <= 10; i++) {
                System.out.println(n + " x " + i + " = " + (n*i));
        }
    }
}
