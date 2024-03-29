package com.etaTech.SetAndHashSet;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/****************************************************
 *** Created by Fady Fouad on 5/22/2019 at 16:09.***
 ***************************************************/
public class Main {
    private static Map<String, HeavenlyBody> solarSys = new HashMap<>();
    private static Set<HeavenlyBody> plants = new HashSet<>();

    public static void main(String[] args) {
        HeavenlyBody temp = new Planet("Mercury", 88);
        solarSys.put(temp.getName(), temp);
        plants.add(temp);
        HeavenlyBody tempMoon = new Moon("Mercury_Moon",27);
        solarSys.put(tempMoon.getName(),tempMoon);
        temp.addSat(tempMoon);

        temp = new Planet("Venus", 225);
        solarSys.put(temp.getName(), temp);
        plants.add(temp);

        temp = new Planet("Earth", 365);
        solarSys.put(temp.getName(), temp);
        plants.add(temp);
        tempMoon = new Moon("Earth_Moon",27);
        solarSys.put(tempMoon.getName(),tempMoon);
        temp.addSat(tempMoon);
        tempMoon = new Moon("Moon2", 27);
        solarSys.put(tempMoon.getName(), tempMoon);
        temp.addSat(tempMoon);

        System.out.println("plants... ");
        for (HeavenlyBody plants :
                plants) {
            System.out.println(plants);
        }

        HeavenlyBody body = solarSys.get("Mercury");
        System.out.println(body.getName());
        for (HeavenlyBody body1 :
                body.getSats()) {
            System.out.println(body1);
        }


        Set<HeavenlyBody> moons = new HashSet<>();
        for (HeavenlyBody plant :
                plants) {
            moons.addAll(plant.getSats());
        }

        System.out.println("Moons...");
        for (HeavenlyBody moon :
                moons) {
            System.out.println(moon);
        }

        HeavenlyBody pluto = new Planet("Earth",364);
        plants.add(pluto);

        System.out.println("Plants...");

        for (HeavenlyBody plant :
                plants) {
            System.out.println("\t"+plant.getName()+ " : "+plant.getOrbitalPeride());//This will show Earth twice (To avoid that U should ovveride equal & Hashcode Methods )
        }


    }
}