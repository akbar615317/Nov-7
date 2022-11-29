package com.rajala;

import java.text.NumberFormat;

public class factorymethods {

    public static void main(String[] args) {
        final double PI = 3.14;

        double r=16.324;
        double area = PI * r * r;
        System.out.println("Area of circle is: " + area);
        NumberFormat obj=NumberFormat.getNumberInstance();

        obj.setMaximumFractionDigits(3);
        obj.setMaximumIntegerDigits(10);
        String str=obj.format(area);
        System.out.println("Area of circle is: " + str);

    }
}
