package com.rajala.innerclass;



public class DemoAnonymous {

        public static void main(String[] args) {
            Person p=new Person() {
                @Override
                public void walk() {
                    System.out.println("am walking");
                }
            };
            p.walk();
        }
}
