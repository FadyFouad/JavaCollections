package com.etaTech.SetAndHashSet;

import java.util.Objects;

/****************************************************
 *** Created by Fady Fouad on 5/22/2019 at 21:37.***
 ***************************************************/
public class Animal {
    private final String name;

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public final boolean equals(Object o) {
        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Animal animal = (Animal) o;
//        String obName = animal.getName();
//        return obName.equals(name);
        if (o instanceof Animal){
            Animal animal = (Animal) o;
            String obName = animal.name;
            return obName.equals(name);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return getName().hashCode();
    }
}