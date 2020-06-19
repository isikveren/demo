package com.TestDemo;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public class StudentTestDemo {
    public static void main(String[] args) {
        ArrayList<Student> array = new ArrayList<Student>();
        while (true) {
            System.out.println("——————————欢迎来到学生管理系统！————————————");
            System.out.println("\t1  添加学生");
            System.out.println("\t2  删除学生");
            System.out.println("\t3  修改学生");
            System.out.println("\t4  查看学生");
            System.out.println("\t5  退出 ");
            System.out.println("\t请输入你的选择：");
            Scanner sc = new Scanner(System.in);
            String i = sc.nextLine();
            switch (i) {
                case "1":
//                    System.out.println("\t1  添加学生");
                    while(true) {
                        addStudent(array);
                        System.out.println("还需添加学生吗(yes/no)?");
                        String singl = sc.nextLine();
                        if(singl.equals("no")) {
                            break;
                        }
                    }
                    break;
                case "2":
                    System.out.println("\t2  删除学生");
                    delStudent(array);
                    System.out.println("请输入任意值返回！");
                    String dalay = sc.nextLine();
                    break;
                case "3":
                    System.out.println("\t3  修改学生");
                    updateStudent(array);
                    break;
                case "4":
                    System.out.println("\t4  查看学生");
                    getStudent(array);
                    System.out.println("请输入任意值返回！");
                    dalay = sc.nextLine();

                    break;
                case "5":
                    System.out.println("\t5  退出 ");
                    System.exit(0);//JVM退出
            }

        }


    }

    //添加学生
    public static void addStudent(ArrayList<Student> array) {
        Scanner sc = new Scanner(System.in);
        Student s = new Student();
        System.out.println("学号：");
        String sid = sc.nextLine();
        if(judgeSid(array,sid)){
            s.setSid(sid);
            System.out.println("姓名：");
            String name = sc.nextLine();
            s.setName(name);
            System.out.println("年龄：");
            String age = sc.nextLine();
            s.setAge(age);
            System.out.println("地址：");
            String address = sc.nextLine();
            s.setAddress(address);

            array.add(s);
            System.out.println("成功添加： 学号：" + s.getSid() + " 姓名：" + s.getName() + " 年龄：" + s.getAge() + "岁 地址：" + s.getAddress());

        }
        else
            System.out.println("学号重复！");


    }

    //查看学生
    public static void getStudent(ArrayList<Student> array) {
        if(array.size() == 0){
            System.out.println("无信息，请先添加信息再查询！");
            return;//为了不让程序往下执行
        }
            System.out.println("学号\t\t姓名\t\t年龄\t\t地址");
            for (Student s : array) {
                System.out.println(s.getSid() + "\t" + s.getName() + "\t" + s.getAge() + "岁\t" + s.getAddress());

        }
    }

    //删除学生
    public static void delStudent(ArrayList<Student> array){
        if(array.size() == 0){
            System.out.println("无信息可删除！");
            return;//为了不让程序往下执行
        }
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入要删除学生的学号：");

        String sid = sc.nextLine();
        int index = -1;
        for(int i = 0;i<array.size();i++){
            Student s = array.get(i);
            if(s.getSid().equals(sid)){
                index = i;
                break;
            }
        }
        if(index == -1){
            System.out.println("学号不存在！");
        }
        else{
            array.remove(index);
            System.out.println("成功删除！");
        }

    }

    //修改学生
    public static void updateStudent(ArrayList<Student> array) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入要修改信息的学生学号：");
        String sid = sc.nextLine();
        int index = -1;
        for (int i = 0; i < array.size(); i++) {
            Student ss = array.get(i);
            if (ss.getSid().equals(sid)) {
                index = i;
                break;
            }
        }
        if(index == -1){
            System.out.println("学号不存在！");
        }
        else{System.out.println("新姓名：");
            String name = sc.nextLine();
            System.out.println("新年龄：");
            String age = sc.nextLine();
            System.out.println("新地址：");
            String address = sc.nextLine();

            Student s = new Student(sid,name,age,address);
            array.set(index,s);
            System.out.println("修改成功！");
        }

    }

    //判断学号是否重复
    public static boolean judgeSid(ArrayList<Student> array,String sid){
        boolean flag = true;
        for(int i = 0;i<array.size();i++)
            if (array.get(i).getSid().equals(sid)) flag = false;
        return flag;

    }

}