package com.rajala;

class Person
{

    public String name;
    public int age;


  Person(String name,int age)
  {
   this.name=name;
    this.age=age;
  }

}
public class Demo  {

    public static void main(String[] args) {
        Person p = new Person("Java",25);

        System.out.println(p.hashCode());
        //String a=p.name;
        //System.out.println(a.trim());
       System.out.println(p.name);
       System.out.println(p.age);
    }
}
