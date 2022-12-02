package com.rajala.absractclass;

abstract class ExpAbstact {

    int x;
    ExpAbstact(){
        x=10;
    }

    void display()
    {
        System.out.print("am in side absract class");
    }

    abstract void hi();
}


