package com.etaTech.SetAndHashSet;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/****************************************************
 *** Created by Fady Fouad on 5/22/2019 at 15:46.***
 ***************************************************/

public final class HeavenlyBody {

    private final String name;
    private final double orbitalPeride ;
    private final Set<HeavenlyBody> sats;

    public HeavenlyBody(String name, double orbitalPeride) {
        this.name = name;
        this.orbitalPeride = orbitalPeride;
        this.sats = new HashSet<>();
    }

    public String getName() {
        return name;
    }

    public double getOrbitalPeride() {
        return orbitalPeride;
    }

    public boolean addMoon (HeavenlyBody moon){
       return this.sats.add(moon);
    }

    public Set<HeavenlyBody> getSats() {
        return new HashSet<>(sats);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        HeavenlyBody body = (HeavenlyBody) o;
        String obName = body.getName();
        return name.equals(obName);
    }

    @Override
    public int hashCode() {
        System.out.println("hashCode : Called ");
        return name.hashCode();
    }
}