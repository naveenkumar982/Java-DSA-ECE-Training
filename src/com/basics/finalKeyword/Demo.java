package com.basics.finalKeyword;

public final  class Demo {
}
//class A extends Demo{
//
//} Cannot extend the final class
class A{
    final void show(){
        System.out.println("show some data");
    }
}
class B extends A{
    //Override is not possible when the method is final
//    @Override
//    void show(){
//        System.out.println("show some different data");
//    }
}
class C {
    final int x = 200;
    // x = 300; // cannot assign to a final value
    void display( final int x){
       // x = 10; // cannot assign a value to final parameter 'x'
    }

}