package com.rajala.java8;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class MapReduceExample {

    public static void main(String[] args) {
        List<Integer> numbers= Arrays.asList(3,5,8,9);

        int sum=0;

        for(int no: numbers)
        {
            sum=sum+no;

        }
        System.out.println(sum);


        int sum1=numbers.stream().mapToInt(i->i).sum();
        System.out.println(sum1);

        Integer reduce=numbers.stream().reduce(0,(a,b)->a+b);
        System.out.println(reduce);


      Optional<Integer> reduceOptional=numbers.stream().reduce(Integer::sum);
        System.out.println(reduceOptional.get());

        Integer reducemultiplication=numbers.stream().reduce(1,(a,b)->a*b);
        System.out.println(reducemultiplication);

        Integer maxValue=numbers.stream().reduce(0,(a,b)->a>b?a:b);
        System.out.println(maxValue);


    }
}
