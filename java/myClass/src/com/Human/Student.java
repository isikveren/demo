package com.Human;

public abstract class Student extends Human{
    public Student(String name, int age) {
        super(name, age);
    }

    public Student() {
    }

    public abstract void learn();

}
