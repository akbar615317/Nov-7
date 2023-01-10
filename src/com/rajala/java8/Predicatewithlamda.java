package com.rajala.java8;

import java.util.function.Predicate;

public class Predicatewithlamda {

    public static void main(String[] args) {

        Predicate<Integer> predicate= (t)->(t%2==0);

        System.out.println( predicate.test(10));


    }
}
