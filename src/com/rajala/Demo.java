package com.rajala;

class Person
{

    public String name;
    public int age;


    public Person() {


    }
}
public class Demo  {

    public static void main(String[] args) {
        Person p = new Person();

      // p.name="oracle";
       //p.age=45;

        System.out.println(p.hashCode());
        //String a=p.name;
        //System.out.println(a.trim());
       System.out.println(p.name);
       System.out.println(p.age);
    }
}
