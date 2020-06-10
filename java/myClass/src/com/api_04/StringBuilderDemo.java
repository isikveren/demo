package com.api_04;

public class StringBuilderDemo {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        sb.append("hello").append(1).append(123).append("ok").reverse().reverse();
        System.out.println("sb:"+sb);
        System.out.println("sb.length():"+sb.length());

        StringBuilder sb2 = new StringBuilder("hello");
        System.out.println("sb2:"+sb2);
        System.out.println("sb2.length():"+sb2.length());

        String s = sb.toString();
        System.out.println("s:"+s);
        StringBuilder ss = new StringBuilder(s);
        ss.reverse();
        System.out.println("ss:"+ss);


    }
}
