package com.itheima_03;

import java.util.Scanner;

public class StudentDemo {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Student s = new Student();
        s.setName("林青霞");
        System.out.print("Please enter "+s.getName()+"'s age:");
        int a = sc.nextInt();
        s.setAge(a);


        System.out.println("学生姓名："+s.getName()+",学生年龄："+s.getAge());
    }
}