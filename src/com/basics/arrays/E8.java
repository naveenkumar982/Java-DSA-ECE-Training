package com.basics.arrays;

import java.util.Arrays;

//Arrays of Objects {Students} {Interns} {Books} {Pens} {Bikes}
class Student{
    String name;
    int USN;
}
class Inetrn{
    String name;
    int id;
    Inetrn(String n,int id){
        this.name=n;
        this.id=id;
    }
}
public class E8 {
    public static void main(String[] args) {
        // int[] arr = {1,2,3,4,5,6}
        Student[] s1 = new Student[3];
        // {Student[0]{}, Student[1]{},Student[3]{}
        s1[0] = new Student();
        s1[0].name = "Naveen";
        s1[0].USN = 70;
        System.out.println(s1[0].name  + ", " + s1[0].USN);
        Inetrn[] interns = new Inetrn[]{new Inetrn("Akash",80085),
        new Inetrn("likith",69)};
        for (Inetrn i : interns) {
            System.out.println(i.name + ", " + i.id);
        }
    }
}
