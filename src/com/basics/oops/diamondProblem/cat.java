package com.basics.oops.diamondProblem;

public interface cat {
    default void sound(){
        System.out.println("Meow!");
    }
}
interface Dog{
    static void sound(){
        System.out.println("Bow Bow!");
    }
}
class Cog implements cat, Dog{
    public void sound(){
        //System.out.println("Some new sound!!");
        cat.super.sound();
        Dog.sound();
    }
}
class Demo{
    public static void main(String[] args) {
        Cog cog = new Cog();
        cog.sound();
    }
}
