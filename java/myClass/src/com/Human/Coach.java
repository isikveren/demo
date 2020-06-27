package com.Human;

public abstract class Coach extends Human{
    public Coach(String name, int age) {
        super(name, age);
    }

    public Coach() {
    }

    public abstract void teach();
}
