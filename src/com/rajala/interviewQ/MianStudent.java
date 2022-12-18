package com.rajala.interviewQ;

public class MianStudent {
    public static void main(String[] args) {

        Student stud1=new Student();

        stud1.setId(1);
        stud1.setName("Rajala");

        Student stud2=new Student();
        stud2.setId(1);
        stud2.setName("Rajala");

        System.out.println("shallow comparison  "+ (stud1==stud2));

        System.out.println("deep comparison   "+ (stud1.equals(stud2)));

        Thread t=Thread.currentThread();

        System.out.println(t.getName());

    }

}
