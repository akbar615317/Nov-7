package com.rajala.string;

public class FirstExp {
    public static void main(String[] args) {



        StringBuffer sb=new StringBuffer("Hello");

        sb.append("Java");

        sb.hashCode();


        System.out.println(sb);
        String s1= "Rajala";

        char[] ch=s1.toCharArray();

        //int n=ch.length;

        System.out.println(ch.length);

        for(int j=ch.length-1;j>=0;j--){

            System.out.print(ch[j]);
        }

        System.out.println();

        String s2= s1.intern();
        String s3= new String("Rajala").intern();
        System.out.println(s1==s2);
        System.out.println(s1==s3);
        System.out.println(s3==s2);









        String str1 = "Hello";

        String str5 = "This is java training";

    String str2=new String("Hello");
        //String str8=new String("Hello").intern();

    String str9=new String("Hello").intern();

    System.out.println(str1==str9);


   // System.out.println(str1.trim());

        String str10[]= str5.split(" ");

        for(int i=0;i<str10.length;i++)
        {
            System.out.println(str10[i]);
        }

        System.out.println(str1==str2);

        System.out.println(str1.equals(str2));

        System.out.println(str1.startsWith("He"));

        System.out.println(str5.lastIndexOf("is"));

        System.out.println(str2.endsWith("lo"));
        String str3 = "hello";
        System.out.println(str3.compareTo(str1));
        System.out.println(str3.compareToIgnoreCase(str1));

        System.out.println(str3.concat("World"));
        System.out.println(str3.equals(str1));

        System.out.println(str3);
        System.out.println(str3.toUpperCase());//HELLO
        System.out.println(str3.length());

        System.out.println(str3.toLowerCase());//hello

        System.out.println(str3.replace("l", "m"));//hemmo

        System.out.println(str3.substring(2, 4));//ll

        System.out.println(str3.charAt(2));//l


        String str4= new String("Hello");


    }
}