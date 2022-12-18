package com.rajala.exceptions;

public class CustomerData {

    private int accno[] = {1001, 1002, 1003, 1004};

    private String name[] = {"Nish", "Shubh", "Sush", "Abhi", "Akash"};

    private double bal[] = {10000.00, 12000.00, 5600.0, 999.00, 1100.55};

    public void display() {
        System.out.println("ACCNO" + "\t" + "CUSTOMER" + "\t" + "BALANCE");

        for (int i = 0; i < 5; i++) {
            System.out.println(accno[i] + "\t" + name[i] + "\t" + bal[i]);
            if (bal[i] < 1000) {
                try {
                    throw new MyException("Balance is less than 1000");
                } catch (MyException e) {
                    e.printStackTrace();
                    System.out.println(e.getMessage());


                }
            }
        }

    }
}
