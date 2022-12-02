package com.rajala.typecasting;

public class DemoWidening {

    public static void main(String[] args) {

      One o=(One) new Two(); //Widening

      Two t=(Two)o;// converting superclass reference variable to subclass reference variable
      t.show2t();
      t.show1t();


        // we cannot convert superclass to subclass

      //  Two t=  (Two)   new One();

        //t.show2t();

    }
}
