package com.rajala.collections;


import java.lang.*;
import java.util.Comparator;

public class StudentR implements Comparator<StudentR> {

    int id;

    public StudentR(int id, String name, String course) {
        this.id = id;
        this.name = name;
        this.course = course;
    }

    String name;
    String course;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }


    public int compare(StudentR st1, StudentR st2){
        if(st1.getCourse().compareTo(st2.getCourse())!=0)
            return st1.getCourse().compareTo(st2.getCourse());
        else
            return st1.getName().compareTo(st2.getName());

    }
}
