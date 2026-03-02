package com.basics.oops.pillars.inheritance.single;

public class Library {
    String name;
    int ID;

    Library(String name, int ID) {
        this.name = name;
        this.ID = ID;
    }
}

    class Book extends Library {
        double price;
        Book(int ID, String name,double price){
            super(name,ID);
            this.price = price;
        }
        void details(){
            System.out.println(name+" " + ID +" "+price);
        }

        static void main(String[] args) {
            Book book = new Book(1, "Psychology Of money ", 12.99);
            book.details();
        }
    }

