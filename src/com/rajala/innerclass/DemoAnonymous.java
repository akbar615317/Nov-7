package com.rajala.innerclass;



public class DemoAnonymous {

        public static void main(String[] args) {
            Person p=   (a,b)  -> a+b;

            System.out.println(p.add(10,20));
        }
}
