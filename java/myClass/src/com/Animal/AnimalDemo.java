package com.Animal;


import java.util.Scanner;

public class AnimalDemo {
    public static void main(String[] args) {
        AnimalOperator ao = new AnimalOperator();
        Animal a = new Cat();
        ao.userAnimal(a);
        Animal aa = ao.getAnimal();
        ao.userAnimal(aa);

        Jump j = new Cat();
        ao.useJummping(j);


    }
}
