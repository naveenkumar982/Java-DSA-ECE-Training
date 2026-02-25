package com.basics.oops.withConstructor;
public class Student {
    //Instance Variables
    int USN;
    String name;
    int marks;
    Student(int USN, String name, int marks) {
        this.USN = USN;
        this.name = name;
        this.marks = marks;
    }
    void evaluateMarks(){
        if(marks<100){
            System.out.println(name +" is failed");
        }else {
            System.out.println(name +" is brilliant");
        }
    }
    public static void main(String[] args) {
        //object creation syntax : ClassName obj = new Classname();
        Student s1 =new Student(06 , "Akash",98);
        Student s2 =new Student(57, "Likith",98);
        Student s3 =new Student(70, "Naveen kumar",70);
        s1.evaluateMarks();
        s2.evaluateMarks();
        s3.evaluateMarks();
    }
}
