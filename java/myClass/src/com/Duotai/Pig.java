package com.Duotai;

public class Pig extends Animal{
    public Pig() {
    }

    public Pig(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {

        System.out.println("🐖吃白菜！");
    }
}
