package com.rajala.relationobjects;

class One
{
    int x;
    Two t;

    One(Two t)
    {
        this.t=t;
        x=10;
    }

    void display()
    {
        System.out.println("x="+x);
        System.out.println("t.y="+t.y);
    }
}
class Two
{
    int y;

    Two(int y)
    {

        this.y=y;
    }

}



public class Relate {


    public static void main(String[] args) {
        Two t=new Two(20);//parameterized constructor
        One o=new One(t);
        o.display();

    }
}
