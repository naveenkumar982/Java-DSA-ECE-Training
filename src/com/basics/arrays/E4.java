package com.basics.arrays;

public class E4 {
    public static void main(String[] args) {
        int[][] numbers = {{1,2,3,4,5},
                            {4,5,6},
                            {8}};
        for(int[] x : numbers) {
            for(int y : x) {
                System.out.print(y + " ");
            }
            System.out.println();
        }
        char [][] names = {{'A','B','C','D'},
                          {'E','F','G','H'},
                          {'I','J','K','L'},
                          {'M','N','O','P'},};
        for(char[] x : names) {
            for(char y : x) {
                System.out.print(y + " ");
            }
            System.out.println();
        }
        boolean[][] data = {{true,false,true},
                {true,false},
        {true}};
        for(boolean[] x : data) {
            for(boolean y : x) {
                System.out.print(y + " ");
            }
            System.out.println();
        }
    }
}
