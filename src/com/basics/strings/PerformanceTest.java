package com.basics.strings;

public class PerformanceTest {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        StringBuilder builder = new StringBuilder("Java");
        for (int i = 1; i <1000000; i++) {
            builder.append("DSA");
        }
        System.out.println("Builder Time: "+ (System.currentTimeMillis() - startTime) + "ms");

        startTime = System.currentTimeMillis();
        StringBuffer Buffer = new StringBuffer("Java");
        for (int i = 1; i <1000000; i++) {
            Buffer.append("DSA");

        }
        System.out.println("Buffer Time: "+ (System.currentTimeMillis() - startTime) + "ms");
    }
}
