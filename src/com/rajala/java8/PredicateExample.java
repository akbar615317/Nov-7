package com.rajala.java8;

import java.util.function.Predicate;

public class PredicateExample implements Predicate<Integer> {


    @Override
    public boolean test(Integer integer) {
        if(integer%2==0)
            return true;
        else
           return false;
    }

    public static void main(String[] args) {

        Predicate<Integer> predicate=new PredicateExample();
       System.out.println(predicate.test(9));
    }
}
