package com.rajala.java8;

import java.util.function.Supplier;

public class SupplierDemoWithLamda {

    public static void main(String[] args) {


        Supplier<String> su1= ()-> { return "java"; };
        System.out.println(su1.get());
    }
}
