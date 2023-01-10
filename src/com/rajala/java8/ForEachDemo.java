package com.rajala.java8;

import java.util.*;

public class ForEachDemo {


    public static void main(String[] args) {
        List<String> list=new ArrayList<>();
        list.add("akbar");
        list.add("john");
        list.add("ram");
        list.add("ramana");

        list.stream().forEach(t-> System.out.println(t));

        list.stream().sorted().forEach(s-> System.out.println("sorted  " +s));

        list.stream().sorted(Comparator.reverseOrder()).forEach(s-> System.out.println("sorted  " +s));

        System.out.println("--------------------------");

        list.stream().filter(t-> t.startsWith("a")).forEach(t->System.out.println(t));

        Map<Integer,String> map=new HashMap<>();

        map.put(1,"a");
        map.put(2,"b");
        map.put(3,"c");
        map.put(4,"d");

        map.forEach((key,value)->   System.out.println(key + "  " + value));

        map.entrySet().stream().forEach(obj-> System.out.println(obj));

        map.entrySet().stream().filter(k->k.getKey()%2==0).forEach(obj-> System.out.println(obj));



    }
}
