package com.chouxianglei;

public abstract class Animal {
    private int age = 30;
    private final String city = "北京";

    public Animal() {
    }

    public abstract void eat();
    public void show(){
        System.out.println(age +","+ city);
    }

    public void sleep(){
        System.out.println("睡觉");
    }
}
