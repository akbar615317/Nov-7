package com.rajala.input;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Accept {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int i = Integer.parseInt(br.readLine());
        float f = Float.parseFloat(br.readLine());
        short s = Short.parseShort(br.readLine());
        byte b = Byte.parseByte(br.readLine());
        double d = Double.parseDouble(br.readLine());


    }

    }

