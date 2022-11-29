package com.rajala.relationobjects;


class One1
{
    void show1()
    {

        System.out.println("super class method");
    }
}
class Two2 extends One1
{
    void show2() {
        System.out.println("sub class method");
    }


}


public class Cast {
    public static void main(String[] args) {
Two2 t=new Two2();

t.show1();
t.show2();



    }
}
