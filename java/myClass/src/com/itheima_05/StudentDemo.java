package com.itheima_05;
import java.util.Scanner;

public class StudentDemo {
    public static void main(String[] args) {
        Student s1 = new Student("李世民", 30);
        Student s2 = new Student();
        Scanner sc = new Scanner(System.in);

        s1.show();
        s2.show();
        s2.setAge(24);
        String s = sc.nextLine();
        s2.setName(s);
        s1.show();
        s2.show();

    }
}
