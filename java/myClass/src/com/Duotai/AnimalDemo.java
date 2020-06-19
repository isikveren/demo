package com.Duotai;

public class AnimalDemo {
    public static void main(String[] args) {
        Animal a = new Cat();  //向上转型
        a.setName("加菲猫");
        a.setAge(30);
        a.show();
        a.eat();
        Animal b;
        b = new Dog("小黑",20);
        b.show();
        b.eat();


//        System.out.println(a.age);
//        a.playgame();
//        Cat c = new Cat();
//        AnimalOperation A = new AnimalOperation();
//        A.useAnimal(c);
//        Dog d = new Dog();
//        A.useAnimal(d);
//        Pig p = new Pig();
//        A.useAnimal(p);
//        Cat c = (Cat) a;
//        c.playgame();
    }

}
