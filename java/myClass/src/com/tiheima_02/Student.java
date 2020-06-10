package com.tiheima_02;
public class Student {
    //成员变量
    String name;
    private int age;

    //成员方法
    public void show(){
        System.out.println(name + "," +age);
    }

    public void setAge(int a){
        if(a<0||a>120){
            System.out.println("你给的年龄有误！！");
        }else {
            age = a;
        }
    }
    public int getAge(){
        return age;
    }
}
