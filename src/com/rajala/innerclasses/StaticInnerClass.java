package com.rajala.innerclasses;

public class StaticInnerClass {

    static int x = 10;
    int y=15;

    static class InnerClass {
        public void innerDisplay() {
            System.out.println("Value of x is: " + x);
        }
    }

    public static void main(String[] args) {
        StaticInnerClass.InnerClass innerClass = new StaticInnerClass.InnerClass();
        innerClass.innerDisplay();
    }

}
