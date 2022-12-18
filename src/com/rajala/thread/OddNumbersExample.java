package com.rajala.thread;

public class OddNumbersExample {

    int countr=1;
    static int num;
    public void displayOddNumber()
    {
        synchronized (this) {
            while (countr < num) {
                while (num % 2 == 0) {
                    try {
                        wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println(Thread.currentThread().getName() + " " + countr);
                countr++;
                num++;
                notify();
            }
        }

        public void displayEvenNumber()
        {
            synchronized (this) {
                while (countr < num) {
                    while (num % 2 != 0) {
                        try {
                            wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    System.out.println(Thread.currentThread().getName() + " " + countr);
                    countr++;
                    num++;
                    notify();
                }
            }
        }

        public static void main(String[] args) {
        OddNumbersExample oddNumbersExample = new OddNumbersExample();
        num = 1;
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                oddNumbersExample.displayOddNumber();
            }
        });
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                displayEvenNumber();
            }
        });
        t1.start();
        t2.start();


    }


}
