package com.rajala.exceptions;

public class DemoException {

    public static void main(String[] args) {
        int a = 10;
        int b =0;
        try {
            int c = a / b;
        }
        catch (ArithmeticException e) {
           System.out.println(e.getMessage());
        }


        finally {
            System.out.println("Finally block");
        }
        int d= a+b;
        System.out.println("Result: " + d);



            System.out.println("HI");

    }
}
