package com.FinalStaticDemo;

public class Demo {
    public static void main(String[] args) {
        final Zi z = new Zi();
        z.show();
        z.sid = 30;
        System.out.println(z.sid);
    }
}
