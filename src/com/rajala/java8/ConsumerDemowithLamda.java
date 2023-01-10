package com.rajala.java8;

import java.util.function.Consumer;

public class ConsumerDemowithLamda{

    public static void main(String[] args) {

        Consumer<Integer> cun=(t)->  System.out.println("value is "+t);

        cun.accept(20);


    }
}
