package com.basics.oops.pillars.abstraction.interfaces;

public interface Animal {
    //interfaces have methods with completely empty bodies
    //interfaces don't have normal methods
    //So they exibhit 100% abstraction
    //The  methods are defined in the child class
    void run();
    void loves_to_eat();
}
class Rat implements Animal{
    @Override
    public void run() {
        System.out.println("Rats run fast");
    }
    @Override
    public void loves_to_eat() {
        System.out.println("Rats love to eat cheese.");
    }
}
class cat implements Animal{
    @Override
    public void run() {
        System.out.println("cats run fast");
    }
    @Override
    public void loves_to_eat() {
        System.out.println("Cats love to eat rats.");
    }
}
class Interfacedemo{
    public static void main(String[] args) {
        Animal rat = new Rat();
        rat.run();
        rat.loves_to_eat();
        cat Cat = new cat();
        Cat.run();
        Cat.loves_to_eat();
    }
}

