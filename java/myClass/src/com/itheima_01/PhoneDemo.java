package com.itheima_01;

public class PhoneDemo {
    public static void main(String[] args){
        Phone p = new Phone();
        System.out.println("\n手机：");
        System.out.println(p.brand);
        System.out.println(p.price);
        p.call();
        p.brand = "小米";
        p.price = 3999;

        System.out.println(p.brand);
        System.out.println(p.price);
    }
}
