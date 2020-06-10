package com.itheima_04;

public class Student {
    private int age;
    private String name;

    //构造方法
    public Student(){

    }
    public Student(String name,int age){
        this.name = name;
        this.age = age;

    }
    public void show(){
        System.out.println(name +","+ age);
    }
}
