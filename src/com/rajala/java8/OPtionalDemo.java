package com.rajala.java8;

import java.util.Arrays;
import java.util.Optional;

public class OPtionalDemo {

        public static void main(String[] args) {
            // TODO Auto-generated method stub



            Customer customer = new Customer(101, "Rajala", null, Arrays.asList("1234567890", "0987654321"));

            //empty
            //of
            //ofNullable

              Optional<Object> emptyOptional= Optional.empty();

              System.out.println(emptyOptional);

            //Optional<String> email = Optional.of(customer.getEmail()); //never nll
            //System.out.println(emptyOptional);

            Optional<String> emailnullanle = Optional.ofNullable(customer.getEmail()); // may or may not null

            //if(emailnullanle.isPresent())
           // System.out.println(emailnullanle.orElse("akbar@gmail.com"));

          //  System.out.println(emailnullanle.orElseThrow(()-> new IllegalArgumentException("email not found")));
            System.out.println(emailnullanle.orElseGet(()->"abcd"));
            System.out.println("HI");



        }

}
