package com.rajala.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EkartDataBase {

    public static List<Customer> getAll()
    {
        return Stream.of(
                new Customer(101,"john","john@gmail.com", Arrays.asList("98438977","89579243765")),
                new Customer(102,"venki","venki@gmail.com", Arrays.asList("837486345","89269892")),
                new Customer(103,"uppi","uppi@gmail.com", Arrays.asList("878834285","787898498")),
                new Customer(104,"praveen","praveen@gmail.com", Arrays.asList("39485985","95893285"))
        ).collect(Collectors.toList());



    }
}
