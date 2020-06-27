package com.Human;

public class PingpongCoach extends Coach implements SpeakEnglish{
    public PingpongCoach(String name, int age) {
        super(name, age);
    }

    public PingpongCoach() {
    }

    @Override
    public void teach() {
        System.out.println("乒乓球教练" + getName()+"教如何发球和接球");
    }

    @Override
    public void eat() {
        System.out.println("乒乓球教练" + getName()+
                "吃牛肉和牛奶");

    }

    @Override
    public void speakenglish() {
        System.out.println("乒乓球教练" +
                getName()+"会说英语");

    }
}
