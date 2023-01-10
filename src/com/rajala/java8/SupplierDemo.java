package com.rajala.java8;

import java.util.function.Supplier;

public class SupplierDemo implements Supplier<String> {

    @Override
    public String get() {
        return "java";
    }

    public static void main(String[] args) {

        Supplier<String> su=new SupplierDemo();

        System.out.println(su.get());

    }
}
