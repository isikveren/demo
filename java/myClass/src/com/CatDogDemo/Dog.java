package com.CatDogDemo;

public class Dog extends Animal{
    public Dog(){}
    public Dog(String name,int age){
        super(name,age);
    }
    public void Kanmen(){
        System.out.println("狗看门！");
    }
}
