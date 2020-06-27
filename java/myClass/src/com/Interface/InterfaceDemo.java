package com.Interface;

public class InterfaceDemo {
    public static void main(String[] args) {
        Interface i = new InterfaceImpl();
        Interface b = new InterfaceImpl();
        System.out.println(i.num);
        System.out.println(i.num2);
        System.out.println(Interface.num2);
    }
}
