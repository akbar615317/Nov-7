package com.rajala.example;

public class exp1 {
    public static void main(String[] args) {
        int sum=0;
        for(int i=0;i<100;i*=(++i)) {
            sum+=i;
            System.out.println(i);

        }
    }
}
