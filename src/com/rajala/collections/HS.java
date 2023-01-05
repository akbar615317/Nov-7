package com.rajala.collections;

import java.util.*;

public class HS {

    public static void main(String[] args) {



        List<StudentR> set = new ArrayList<StudentR>();


     


        set.add(new StudentR(1, "Rajala", "python"));
        set.add(new StudentR(2, "way2classroom", "java2"));
        set.add(new StudentR(3, "techadders", "c"));



        Collections.sort(set, new StudentR(0, "", ""));
        Iterator<StudentR> it = set.iterator();

        while(it.hasNext()){
            StudentR s = it.next();
            System.out.println(s.getId() + " " + s.getName() + " " + s.getCourse());
        }


    }

}
