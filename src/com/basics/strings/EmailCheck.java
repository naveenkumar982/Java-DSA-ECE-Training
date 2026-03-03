package com.basics.strings;

public class EmailCheck {
    public static void main(String[] args) {
        String email1 = "naveen@gmail.com";
        String email2 = "student_edu";
        if(email1.contains("@") && email1.endsWith(".com")){
            System.out.println("Valid Email Address");
        }else{
            System.out.println("Invalid Email Address");
        }
        if(email2.contains("@") && email2.endsWith(".com")){
            System.out.println("Valid Email Address");
        }else {
            System.out.println("Invalid Email Address");
        }
        String USN = "1SG23EC070";
        System.out.println(USN.endsWith(""));
    }
}
