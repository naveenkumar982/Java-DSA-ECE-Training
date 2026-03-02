package com.basics.oops.pillars.inheritance.hybrid;
interface Sports{
    void play();
}
class Person{
    String name;
    Person(String name){
        this.name = name;
    }
}
public class Student extends Person implements Sports{
    Student (String name){
        super(name);// here
    }
@Override
    public void play(){
    System.out.println(name + " plays football");
}

    static void main(String[] args) {
        Student s1 = new Student("Sam");
        s1.play();
    }
}
