package com.StudentTeacherDemo;

public class Demo {
    public static void main(String[] args) {
        Student s = new Student();
        s.study();
        s.setAge(16);
        s.setName("林青霞");
        Teacher t = new Teacher("李小龙",30);
//        t.setAge(30);
//        t.setName("风清扬");
        t.teach();
        t.show();
        s.show();
    }
}
