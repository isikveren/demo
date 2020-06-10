package com.api_02;

public class StringDemo02 {
    public static void main(String[] args) {
        char []chs = {'a','b','c'};
        String s1 = new String(chs);
        String s2 = new String(chs);

        String s3 = "abc";
        String s4 = "abc";
        System.out.println("==：--------------------------");
        System.out.println(s1 +" "+s2);
        if(s1 != s2 )   System.out.println(false);
        else    System.out.println(true);

        System.out.println(s3 +" "+s4);
        if(s3 != s4 )   System.out.println(false);
        else    System.out.println(true);
        System.out.println("equal()：--------------------------");
        if(s1.equals(s2))   System.out.println(true);
        else    System.out.println(false);
        if(s3.equals(s4))   System.out.println(true);
        else    System.out.println(false);
    }
}
