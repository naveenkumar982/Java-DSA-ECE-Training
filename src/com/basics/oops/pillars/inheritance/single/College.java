package com.basics.oops.pillars.inheritance.single;

public class College {
    static String clg = "Sapthagiri College Of Engineering";
    String name;
    String address;
    int pincode;
    College(String name,String address,int pincode){
        this.name=name;
        this.address = address;
        this.pincode = pincode;
    }
}
class Department extends College {
    String Block;
    Department(String name,String address,int pincode,String Block){
        super(name,address,pincode);
        this.Block = Block;
    }
    void details(){
        System.out.println(College.clg+" " + name + " " + address+" "+pincode+" "+Block);
    }

    static void main(String[] args) {
        Department dept = new Department("Naveen","dasaarahalli",560067,"ECE");
        dept.details();
    }
}
/*
✅ super.something -> variable from parent class
✔️ super() -> constructor of the Parent class
❌ Don't use super.for constructor
 */