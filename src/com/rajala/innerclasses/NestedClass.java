package com.rajala.innerclasses;

class OuterClass {

    private int x = 20;

    class InnerClass {

        int y = 10;
        public void innerDisplay() {
            System.out.println("Value of y is: " + y);
            System.out.println("Value of x is: " + x);
        }
    }

    void outerDisplay() {

        System.out.println("am in outerDisplay");

    }

}

public class NestedClass {
    public static void main(String[] args) {
        OuterClass outerClass = new OuterClass();
        OuterClass.InnerClass innerClass = outerClass.new InnerClass();
        innerClass.innerDisplay();
    }
}

