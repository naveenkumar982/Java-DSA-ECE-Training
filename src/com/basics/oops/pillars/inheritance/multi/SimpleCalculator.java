package com.basics.oops.pillars.inheritance.multi;

 public class SimpleCalculator {
    void add(int a, int b){
        System.out.println(a+b);
    }
    void sub(int a, int b){
        System.out.println(a-b);
    }
}
class AdvancedCalculator extends SimpleCalculator {
    void divide(int a, int b){
        System.out.println(a/b);
    }
    void multiply(int a, int b){
        System.out.println(a*b);
    }
}
class SuperAdvancedCalculator extends AdvancedCalculator{
    void square(int x){
        System.out.println(Math.pow(x,2));
    }
    void cube(int x){
        System.out.println(Math.pow(x,3));
    }

    static void main(String[] args) {
        System.out.println("=======================================");
        SimpleCalculator c1 = new SimpleCalculator();
        c1.add(1,2);
        c1.sub(5,2);
        System.out.println("=======================================");
        AdvancedCalculator c2 = new AdvancedCalculator();
        c2.divide(8,2);
        c2.multiply(7,2);
        c2.sub(4,2);
        c1.add(9,2);
        System.out.println("=======================================");
        SuperAdvancedCalculator c3 = new SuperAdvancedCalculator();
        c3.square(5);
        c3.cube(2);
        c3.multiply(6,2);
        c3.sub(3,2);
        c1.add(5,2);
        System.out.println("=======================================");
    }
}