package com.etaTech.SetAndHashSet;

/****************************************************
 *** Created by Fady Fouad on 5/22/2019 at 21:38.***
 ***************************************************/
public class Dog extends Animal{

    public Dog(String name) {
        super(name);
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Animal animal = (Animal) o;
//        String obName = animal.getName();
//        return obName.equals(name);
        if (o instanceof Dog){
            Dog dog = (Dog) o;
            String obName = dog.getName();
            return obName.equals(getName());
        }
        return false;
    }
}