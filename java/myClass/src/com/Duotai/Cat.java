package com.Duotai;

public class Cat extends Animal {

    public Cat() {
    }

    public Cat(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        //super.eat();
        System.out.println("猫吃🐟！");
    }

    public void playgame() {
        System.out.println("猫做迷藏！");
    }
}
