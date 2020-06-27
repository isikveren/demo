package com.Duotai;

public class Animal {
    private String name;
    private int age;

    public Animal() {
    }

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void eat(){
        System.out.println("动物吃东西！");
    }
    public void playgame(){
        System.out.println("动物玩！");
    }
    public void show(){
        System.out.println(name+","+age);
    }
}