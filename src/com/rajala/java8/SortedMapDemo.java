package com.rajala.java8;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import java.util.Map;
import java.util.Map.Entry;

public class SortedMapDemo {


    public static void main(String[] args) {


        Map<String,Integer> map=new HashMap<>();

        map.put("eight",8);
        map.put("four",4);
        map.put("ten",10);
        map.put("two",2);

        List<Entry<String,Integer>> entries=new ArrayList<>(map.entrySet());




        for(Entry<String,Integer> entry : entries)
        {
            System.out.println(entry.getKey() +"  " + entry.getValue());
        }


       // map.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(System.out::println);

    }
}
