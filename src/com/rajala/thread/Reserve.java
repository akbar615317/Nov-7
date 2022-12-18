package com.rajala.thread;

public class Reserve implements Runnable {

    private int available = 1;
    private int wanted;

    public Reserve(int i) {
        wanted = i;
    }


    public void run() {

synchronized (this) {
    System.out.println("Available berths = " + available);
    if (available >= wanted) {
        String name = Thread.currentThread().getName();
        System.out.println(wanted + " sBerth reserved for " + name);

        try {
            Thread.sleep(1500);
            available = available - wanted;
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    } else {

        System.out.println("Sorry, no seats available");
    }
}
    }



}
