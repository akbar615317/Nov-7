package com.rajala.java8;

import java.util.stream.IntStream;

public class ParellStreamExample {
    public static void main(String[] args) {


        long start=0;

        long end=0;

        start=System.currentTimeMillis();

        IntStream.range(1,100).forEach(System.out::println);
        end=System.currentTimeMillis();

        System.out.println("plain stream took time ---" +(end-start));


        start=System.currentTimeMillis();

        IntStream.range(1,100).parallel().forEach(System.out::println);
        end=System.currentTimeMillis();

        System.out.println("parallel stream took time ---" +(end-start));
    }
}
