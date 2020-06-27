package com.Human;

public class PingpongStudent extends Student implements SpeakEnglish{
    public PingpongStudent(String name, int age) {
        super(name, age);
    }

    public PingpongStudent() {
    }

    @Override
    public void speakenglish() {
        System.out.println("乒乓球运动员" +getName()+
                "会说英语");

    }

    @Override
    public void learn() {
        System.out.println("乒乓球运动员学");
    }

    @Override
    public void eat() {
        System.out.println("乒乓球运动员吃");
    }
}
