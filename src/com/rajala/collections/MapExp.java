package com.rajala.collections;

import java.awt.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


public class MapExp {

    public static void main(String[] args) {


        Map<Integer,StudentR> map=new HashMap();

        map.put(1,new StudentR(1, "Rajala", "python"));
        map.put(2,new StudentR(2, "way2classroom", "java2"));


        List<Map.Entry<Integer,StudentR>> li=new ArrayList<>(map.entrySet());

        for(Map.Entry<Integer,StudentR> en : li)
        {

            System.out.println(en.getKey());

            List<Object> livalues=new ArrayList<>();

            livalues.add(en.getValue());

            System.out.println(en.getValue().toString());
        }






    }

}
