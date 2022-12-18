package com.rajala.thread;

public class UnSafe {

    public static void main(String[] args) {
        Reserve r = new Reserve(1);
        Thread one = new Thread(r);
        Thread two = new Thread(r);
        one.setName("First Person");
        two.setName("Second Person");

        one.start();
        two.start();
    }
}
