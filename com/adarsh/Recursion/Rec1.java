package com.adarsh.Recursion;

public class Rec1 {
    public static void main(String[] args) {
        message();
    }

    static void message() {
        System.out.println("Hello World!");
        message1();
    }

    static void message1(){
        System.out.println("Hello World!");
        message2();
    }
    static void message2(){
        System.out.println("Hello World!");
    }
}
