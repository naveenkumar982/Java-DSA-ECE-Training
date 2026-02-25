package com.basics.LoopingStatements;

public class PrintingMultiplicationTable {
    public static void main(String[] args) {
    for (int i =1;i<=10;i++) {//for row
        for (int j =1;j<=10;j++) {// for col
            //1*1 = 1
            System.out.print(i + "x" + j + "=" + i*j + "\t");
        }
        System.out.println();
    }
    }
}
