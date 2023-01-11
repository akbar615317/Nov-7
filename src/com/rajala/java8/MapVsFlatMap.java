package com.rajala.java8;

import java.util.List;
import java.util.stream.Collectors;

public class MapVsFlatMap {
    public static void main(String[] args) {
        List<Customer> customers=EkartDataBase.getAll();

        List<String> emails=customers.stream().map(customerList -> customerList.getEmail()).collect(Collectors.toList());


System.out.println(emails);

List<List<String>> phoneNumbers=customers.stream().map(customerList -> customerList.getPhoneNumbers()).collect(Collectors.toList());


        System.out.println(phoneNumbers);

        List<String> phoneNumbersflat=customers.stream().flatMap(customerList -> customerList.getPhoneNumbers().stream()).collect(Collectors.toList());

        System.out.println(phoneNumbersflat);
    }
}
