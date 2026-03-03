package com.basics.statickeyword;

public class Example {
    //static belongs to the stack memory not the heap memory
    //No objects are needed for it.
    //The static block executes with class before main()
    static {
        System.out.println("open the system");
    }
    public static void main(String[] args) {
        System.out.println( "Hello World!" );
    }
    static{
        System.out.println( "internet check" );
    }
}
