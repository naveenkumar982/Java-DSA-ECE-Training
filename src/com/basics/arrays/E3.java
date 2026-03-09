package com.basics.arrays;

public class E3 {
    public static void main(String[] args) {
        int[] arr = {1,3,5,7,9};//1 Dimensional Array
        System.out.println(arr.length);
        // 2D Array or Matrix or [Array of Arrays]
        int[][] matrix = {{1,2,3},//0
                         {4,5,6},//1
                         {7,8,9}};//2
        //Total number of rows = Length of thematrix
        System.out.println(matrix.length);//Total no of rows
        System.out.println(matrix[0].length);//Length of 1st row
        for (int r = 0; r < matrix.length; r++) {
            for (int c = 0; c < matrix[r].length; c++) {
                System.out.print(matrix[r][c] + " ");
            }
            System.out.println();
        }
        char [][] languages = {{'K','a','n','n','a','d','a'},
                {'T','e','l','u','g','u'},
                {'T','a','m','i','l'}};
        System.out.println(languages[0].length);
        System.out.println(languages[1].length);
        // Traversal in a Jogged Array
        for (int r = 0; r < languages.length; r++) {//row 0 till row 4
            for (int c = 0; c < languages[r].length; c++) {//
                System.out.print(languages[r][c] + " ");
            }
            System.out.println();
        }
        int[][] jagged = {{1,2,3,4,5,6,7,8,9},
                         {1,2,3,4,5,},
                        {1,2,3}};
        for (int r = 0; r < jagged.length; r++) {
            for (int c = 0; c < jagged[r].length; c++) {
                System.out.print(jagged[r][c] + " ");
            }
            System.out.println();
        }

    }
}
