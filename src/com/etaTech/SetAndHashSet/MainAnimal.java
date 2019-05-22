package com.etaTech.SetAndHashSet;

/****************************************************
 *** Created by Fady Fouad on 5/22/2019 at 21:42.***
 ***************************************************/
public class MainAnimal {
    public static void main(String[] args) {
        System.out.println("===============================================");
        Dog dog = new Dog("DOG");
        Animal dog1 = new Animal("DOG");

        System.out.println(dog1.equals(dog));
        System.out.println(dog.equals(dog1));

    }
}