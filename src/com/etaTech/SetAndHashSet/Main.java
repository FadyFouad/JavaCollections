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
        HeavenlyBody temp = new HeavenlyBody("Mercury", 88, HeavenlyBody.BodyType.PLANET);
        solarSys.put(temp.getName(), temp);
        plants.add(temp);
        HeavenlyBody tempMoon = new HeavenlyBody("Mercury_Moon",27, HeavenlyBody.BodyType.MOON);
        solarSys.put(tempMoon.getName(),tempMoon);
        temp.addMoon(tempMoon);

        temp = new HeavenlyBody("Venus", 225, HeavenlyBody.BodyType.PLANET);
        solarSys.put(temp.getName(), temp);
        plants.add(temp);

        temp = new HeavenlyBody("Earth", 365,HeavenlyBody.BodyType.PLANET);
        solarSys.put(temp.getName(), temp);
        plants.add(temp);
        tempMoon = new HeavenlyBody("Earth_Moon",27,HeavenlyBody.BodyType.MOON);
        solarSys.put(tempMoon.getName(),tempMoon);
        temp.addMoon(tempMoon);
        tempMoon = new HeavenlyBody("Moon2", 27, HeavenlyBody.BodyType.MOON);
        solarSys.put(tempMoon.getName(), tempMoon);
        temp.addMoon(tempMoon);

        System.out.println("plants... ");
        for (HeavenlyBody plants :
                plants) {
            System.out.println("\t"+plants.getName());
        }
        HeavenlyBody body = solarSys.get("Mercury");
        System.out.println(body.getName());
        for (HeavenlyBody body1 :
                body.getSats()) {
            System.out.println("\t"+body1.getName());
        }

        Set<HeavenlyBody> moons = new HashSet<>();
        for (HeavenlyBody plant :
                plants) {
            moons.addAll(plant.getSats());
        }

        System.out.println("Moons...");
        for (HeavenlyBody moon :
                moons) {
            System.out.println("\t"+moon.getName());
        }

        HeavenlyBody pluto = new HeavenlyBody("Earth",364, HeavenlyBody.BodyType.PLANET);
        plants.add(pluto);

        System.out.println("Plants...");

        for (HeavenlyBody plant :
                plants) {
            System.out.println("\t"+plant.getName()+ " : "+plant.getOrbitalPeride());//This will show Earth twice (To avoid that U should ovveride equal & Hashcode Methods )
        }


    }
}