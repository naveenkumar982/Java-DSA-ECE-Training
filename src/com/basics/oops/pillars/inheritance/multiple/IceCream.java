package com.basics.oops.pillars.inheritance.multiple;

import java.lang.classfile.Interfaces;

public interface IceCream {
    String IceCream();
}
interface IceCream2{
    String IceCream2();
}
interface IceCream3{
    String IceCream3();
}
class Icreams implements IceCream, IceCream2, IceCream3{

    @Override
    public String IceCream() {
        return "Butterscotch";
    }

    @Override
    public String IceCream2() {
        return "chocolate";
    }

    @Override
    public String IceCream3() {
        return "vanila";
    }

    static void main(String[] args) {
        Icreams icreams = new Icreams();
        System.out.println(icreams.IceCream());
        System.out.println(icreams.IceCream2());
        System.out.println(icreams.IceCream3());
    }
}
