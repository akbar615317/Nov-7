package com.rajala.exceptions;

public class DemoException {

    public static void main(String[] args) {
        int a = 10;
        int b =10;
        try {
            int c = a / b;
        }
        finally {
            System.out.println("Finally block");
        }
        int d= a+b;
        System.out.println("Result: " + d);



            System.out.println("HI");

    }
}
