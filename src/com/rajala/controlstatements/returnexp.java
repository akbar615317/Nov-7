package com.rajala.controlstatements;

public class returnexp {

    public static void main(String[] args) {
        int res=returnexp.add(10,20);

        System.out.println(res);
    }

    private static int add(int a, int b) {
        return a+b;
    }
}
