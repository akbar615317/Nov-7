package com.rajala.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ConsumberDemowithlist {

    public static void main(String[] args) {


        List<Integer> list= Arrays.asList(1,2,3,4,5);

        list.stream().forEach(t-> System.out.println(t));




    }
}
