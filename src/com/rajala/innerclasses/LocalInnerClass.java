package com.rajala.innerclasses;

class OuterClass2 {

    void outerDisplay() {
        int x = 100;
        class InnerClass2 {
            public void innerDisplay() {
                System.out.println("Value of x is: " + x);
            }
        }
        InnerClass2 innerClass2 = new InnerClass2();
        innerClass2.innerDisplay();
    }
}

public class LocalInnerClass {
    public static void main(String[] args) {
            OuterClass2  outerClass2= new OuterClass2();
        outerClass2.outerDisplay();



    }
}
