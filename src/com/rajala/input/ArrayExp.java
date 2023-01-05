package com.rajala.input;

public class ArrayExp {

    public static void main(String[] args) {
        int hi[] = {10,20,30,40,50};

        System.out.print(hi.hashCode());

        for(int i=0;i<=hi.length;i++) {
            System.out.println(hi[i]);
        }

        for(int i:hi) {
            System.out.println(i);
        }
    }
}
