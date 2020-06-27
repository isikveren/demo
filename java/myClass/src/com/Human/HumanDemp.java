package com.Human;

public class HumanDemp {
    public static void main(String[] args) {
        PingpongCoach pc = new PingpongCoach("刘翔",19);
        System.out.println(pc.getName()+" ," + pc.getAge());
        pc.eat();
        pc.speakenglish();
        pc.teach();

    }
}
