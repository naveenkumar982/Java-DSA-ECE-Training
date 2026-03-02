package com.basics.oops.pillars.inheritance.hierarchical;

public class User {
    void  role(){
        System.out.println("Generic User");
    }
}
class Admin  extends User{
    @Override
    void  role(){
        System.out.println("Admin User");
    }
}
class Guest extends User{
    @Override
    void  role(){
        System.out.println("Guest User");
    }
    static void main(String[] args) {
        User u1 = new User();
        u1.role();
        //upcasting
        User u2 = new Admin();
        User u3 = new Guest();
        u2.role();
        u3.role();
    }
}
// The reference deosn't matter - The object matters
