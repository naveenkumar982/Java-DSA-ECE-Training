package com.basics.oops.pillars.inheritance.single;

public class Animal {//parent class // super class
    void eat(){
        System.out.println("Animal is eating");
    }
}
class Cat  extends Animal {//child class // sub class
    void run(){
        System.out.println("Cats run very fast.");
    }

    static void main() {
        Cat cat = new Cat();
        cat.run();
        cat.eat();
    }
}

