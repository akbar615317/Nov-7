package com.rajala.methods;

 class ThisMethod {

    private int x;
     ThisMethod()
    {
        this(10);

        System.out.println("Default constructor");
    }
     ThisMethod(int x) {

        this.x=x;
        this.access();


    }

    private void access() {

        System.out.println("x = "+x);
    }
}

public class ThisExp {

    public static void main(String[] args) {

        ThisMethod t = new ThisMethod();
    }
}

