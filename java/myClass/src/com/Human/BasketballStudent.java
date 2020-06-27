package com.Human;

public class BasketballStudent extends Student{
    public BasketballStudent(String name, int age) {
        super(name, age);
    }

    public BasketballStudent() {
    }

    @Override
    public void learn() {
        System.out.println("篮球运动员学篮球");
    }

    @Override
    public void eat() {
        System.out.println("篮球运动员吃");
    }
}
