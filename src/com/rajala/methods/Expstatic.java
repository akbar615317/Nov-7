package com.rajala.methods;

import jdk.dynalink.beans.StaticClass;


class A
{
    static int age=30;

    static int display()
    {
       // System.out.println("Age is "+age);
        return age;
    }

}


public class Expstatic {

    static int a = 10;
    static int b = 20;

static
{

    System.out.println("HI, am in static block");
    System.out.println(A.age);
    System.out.println(A.display());
}

    public static void main(String[] args) {
        //System.out.println(a);

    }
}
