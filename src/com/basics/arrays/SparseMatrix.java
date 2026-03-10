package com.basics.arrays;

public class SparseMatrix {
    static void main(String[] args) {
        int[][] matrix = {{0, 2, 1}, {1, 1, 0}, {2, 0, 1}};
        int zeros = 0;
        int non_zeros = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == 0) {
                    zeros++;
                }else{
                    non_zeros++;
                }
            }
        }
        if (zeros > non_zeros) {
            System.out.println("It is Sparse Matrix");
        } else {
            System.out.println("It is not Sparse Matrix");
        }
    }
}
