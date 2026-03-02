package com.basics.oops.pillars.abstraction.abstractClasses;

abstract class ClassShape {
    abstract void area(int a);
}
class Square extends ClassShape {
    @Override
    void area(int l) {
        System.out.println(Math.pow(l, 2));
    }
}
class Circle extends ClassShape {
    @Override
    void area(int r) {
        System.out.println(Math.PI * r * r);
    }
}
class Main {
    public static void main(String[] args) {
        Square s = new Square();
        ClassShape c = new Circle();
        s.area(4);
        c.area(2);

    }
}

