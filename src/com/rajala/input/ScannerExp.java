package com.rajala.input;

import java.util.Scanner;

public class ScannerExp {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        System.out.println("Enter the value for id,name,sal :");
        Scanner sc = new Scanner(System.in);

        int id = sc.nextInt();
        String name = sc.next();
        float salary = sc.nextFloat();

        System.out.println("entered value " +id);
        System.out.println("entered value " +name);
        System.out.println("entered value " +salary);

    }

}

