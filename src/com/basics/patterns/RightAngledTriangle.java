package com.basics.patterns;

public class RightAngledTriangle {
    static void rightTriangle(int n) {
        for (int r = 1; r <= n; r++) {
            for (int c = 1; c <= r ; c++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
    static void rightTrianglenumbers(int n) {
        for (int r = 1; r <= n; r++) {
            for (int c = 1; c <= r; c++) {
                System.out.print(c + " ");
            }
            System.out.println();
        }
    }

    static void main(String[] args) {
        rightTrianglenumbers(5);
        rightTriangle(5);
    }
}
