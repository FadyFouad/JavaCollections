package com.etaTech.SetAndHashSet;


import java.util.HashMap;
import java.util.Map;

/****************************************************
 *** Created by Fady Fouad on 5/22/2019 at 21:30.***
 ***************************************************/
public class Challenge {
    public static void main(String[] args) {
        System.out.println("===================Challenge=================");

        HeavenlyBody body = new HeavenlyBody("Earth",360, HeavenlyBody.BodyType.PLANET);
        HeavenlyBody moon = new HeavenlyBody("Moon",360, HeavenlyBody.BodyType.MOON);
        System.out.println(body.toString());
        body.addMoon(moon);
        System.out.println(body.toString());

    }
}