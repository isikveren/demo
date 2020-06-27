package com.interface2;

public class Cat extends Animal implements jumping {
    public Cat(String name, int age) {
        super(name, age);
    }

    public Cat() {
    }

    @Override
    public void eat() {
        System.out.println(getName()+"吃鱼");
    }

    @Override
    public void jump() {
        System.out.println(getName()+"跳高");
    }
}
