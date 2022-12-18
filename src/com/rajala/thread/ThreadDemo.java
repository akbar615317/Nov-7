package com.rajala.thread;

public class ThreadDemo {
    public static void main(String[] args) {



long start=0;
long end=0;

        MyThread myThread=new MyThread();
         start=System.currentTimeMillis();
        Thread t1=new Thread(myThread);
        t1.start();
        end=System.currentTimeMillis();
        System.out.println("Time taken by thread 1 "+(end-start));
        System.out.println("-------------------------------------------------------");

        Thread t2=new Thread(myThread);
        t2.start();
        System.out.println("-------------------------------------------------------");
        Thread t3=new Thread(myThread);
        t3.start();



    }
}
