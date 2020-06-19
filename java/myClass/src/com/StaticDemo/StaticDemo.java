package com.StaticDemo;

public class StaticDemo {
    public static void main(String[] args) {
        Student s = new Student();
        s.age = 18;
        s.name = "林青霞";
        Student.university = "三峡大学";
        s.show();
        Student ss = new Student();
        ss.age = 20;
        ss.name = "风清扬";
//        ss.university = "深圳大学";
        ss.show();

    }
}
