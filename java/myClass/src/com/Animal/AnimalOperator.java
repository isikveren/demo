package com.Animal;

import java.util.Scanner;

public class AnimalOperator {
    public void userAnimal(Animal a){
        a.eat();
    }
    public Animal getAnimal(String aa,int b){
        Animal a = new Cat(aa,b);
        return a;
    }
    public Animal getAnimal(){
        Animal a = new Cat();
        return a;
    }
    public void useJummping(Jump p){
        p.jump();
    }
    public Jump getJump(){
        Jump j = new Cat();
        return j;
    }


}
