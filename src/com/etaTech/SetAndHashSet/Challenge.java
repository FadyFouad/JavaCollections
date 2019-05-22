package com.etaTech.SetAndHashSet;

import java.util.Objects;

/****************************************************
 *** Created by Fady Fouad on 5/22/2019 at 21:30.***
 ***************************************************/
public class Challenge {
    private final String name ;

    public Challenge(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Challenge challenge = (Challenge) o;
        String obName = challenge.getName();
        return name.equals(obName);
    }

    @Override
    public int hashCode() {
        return name.hashCode();
    }
}