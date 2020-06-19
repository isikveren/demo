package com.ExtendDemo;

public class Fu {
    public int age = 20;
//    public Fu(){
//        System.out.println("Fu中无参构造方法被调用。");
//    }
    public Fu(int age){
        System.out.println("Fu中带参构造方法被调用！");
    }
    public void show(){
        System.out.println("Fu show 方法调用");
    }
}
