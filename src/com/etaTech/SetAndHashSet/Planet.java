package com.etaTech.SetAndHashSet;

/****************************************************
 *** Created by Fady Fouad on 5/24/2019 at 14:28.***
 ***************************************************/
public class Planet extends HeavenlyBody{
    public Planet(String name, double orbitalPeride) {
        super(name, orbitalPeride, BodyType.PLANET);

    }

    @Override
    public boolean addSat(HeavenlyBody body) {
        if (body.getType()==BodyType.MOON){
            return super.addSat(body);
        }else
            return false;
    }
}