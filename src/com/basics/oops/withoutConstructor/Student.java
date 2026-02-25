package com.basics.oops.withoutConstructor;

public class Student {
    //Instance Variables
    int USN;
    String name;
    int marks;
    void evaluateMarks(){
        if(marks<100){
            System.out.println(name +" is failed");
        }else {
            System.out.println(name +" is brilliant");
        }
    }
    public static void main(String[] args) {
        //object creation syntax : ClassName obj = new Classname();
        Student s1 =new Student();
        s1.USN=06;
        s1.name="Akash";
        s1.marks=99;
        Student s2 =new Student();
        s2.USN=57;
        s2.name="Likith";
        s2.marks=99;
        Student s3 =new Student();
        s3.USN=70;
        s3.name="Naveen Kumar";
        s3.marks=101;
        s1.evaluateMarks();
        s2.evaluateMarks();
        s3.evaluateMarks();
    }
}
