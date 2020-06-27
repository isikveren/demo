package com.Animal;

public class Cat extends Animal implements Jump{
    public Cat() {
    }

    public Cat(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("maochiyu");
    }

    @Override
    public void jump() {
        System.out.println("跳");
    }
}
