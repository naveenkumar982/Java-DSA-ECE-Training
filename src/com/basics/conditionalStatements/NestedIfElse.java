package com.basics.conditionalStatements;

import java.util.Scanner;

public class NestedIfElse {
    static void main(String[] args) {
        /*
        even -> whether it is divisible by 4 or not
        odd -> whether it is divisible by 3 or not
         */
        // Object -> ClassName obj = new Classname();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();
        if(n % 2 ==0){
            if(n % 4 ==0){
                System.out.println(n + " is even & divisble by 4");
            }else {
                System.out.println(n + " is even & not divisible by 4");
            }
        }
        else{
            if(n % 3==0){
                System.out.println(n + " is odd & divisble by 3");
            }else {
                System.out.println(n + " is odd & not divisible by 3");
            }
        }
        }
    }
