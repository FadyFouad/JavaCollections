package com.etaTech.SetAndHashSet;

import java.util.HashSet;
import java.util.Set;

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

        System.out.println("======================================================\n");
        Set<Integer> squers = new HashSet<>();
        Set<Integer> cubes = new HashSet<>();

        for (int i = 0; i < 10; i++) {
            squers.add(i * i);
            cubes.add(i * i * i);
        }
        System.out.println(squers);
        System.out.println(cubes);

        Set<Integer>union = new HashSet<>(squers);
        System.out.println(union);
        union.addAll(cubes);
        System.out.println(union.size());
        System.out.println(union);
        System.out.println("Intersections");
        Set<Integer>intersections= new HashSet<>(squers);
        intersections.retainAll(cubes);
        System.out.println("\t"+intersections);

    }
}