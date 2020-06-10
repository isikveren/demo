package com.tiheima_02;
import java.util.Scanner;

public class StudentDemo {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Student s = new Student();
        s.name = "林青霞";
        System.out.print("Please enter "+s.name+"'s age:");
        int a = sc.nextInt();
        s.setAge(a);


        System.out.println("学生姓名："+s.name+",学生年龄："+s.getAge());
 }
}
