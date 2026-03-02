package com.basics.oops.pillars.abstraction.abstractClasses;

abstract class Vehicle {
    // Two types of methods
    // 1 . Normal OR Concrete
    void vehicle_type(){
        System.out.println("Two wheeler or four wheeler");
    }
    // 2. Abstract method
    abstract void start();//This method will be defined in the child class
    //If there are only abstract method then it is 100% abstraction
    // if there is even 1 normal method - not 100% abstraction
}
class MultistradaV4 extends Vehicle {

    @Override
    void start() {
        System.out.println("MultistradaV4 Starts with self");
    }
}
class Defender extends Vehicle {

    @Override
    void start() {
        System.out.println("Defender Starts with fingerprint");
    }
}
class Demo{
    public static void main(String[] args) {
        MultistradaV4 bike = new MultistradaV4();
        Defender car = new Defender();
        bike.start();
      bike.vehicle_type();
      car.start();
        car.vehicle_type();
    }
}