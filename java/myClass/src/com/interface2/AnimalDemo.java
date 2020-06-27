package com.interface2;

public class AnimalDemo {
    public static void main(String[] args) {
//        jumping j = new Cat();
//        Animal a = new Cat();
//
//        a.setAge(30);
//        a.setName("加菲猫");
//        a.eat();
        Cat c = new Cat("加菲",2);
        c.jump();
        c.eat();
        System.out.println(c.getName()+","+c.getAge());
    }

}
