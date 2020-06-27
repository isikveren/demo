package com.Human;

public class BasketballCoach extends Coach{
    public BasketballCoach(String name, int age) {
        super(name, age);
    }

    public BasketballCoach() {
    }

    @Override
    public void teach() {
        System.out.println("篮球教练教如何运球和投篮");
    }

    @Override
    public void eat() {
        System.out.println("篮球教练吃羊肉喝羊奶");
    }
}
