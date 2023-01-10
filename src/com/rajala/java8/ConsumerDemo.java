package com.rajala.java8;

import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

//public class ConsumerDemo   {


    public class ConsumerDemo implements  Consumer<Integer> {


    public static void main(String[] args) {
        Consumer<Integer> cu=new ConsumerDemo();
        cu.accept(10);

    }

        @Override
        public void accept(Integer t) {

            System.out.println("t value is " +t);

        }
    }
